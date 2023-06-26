package com.example.mod6demointentimplicite

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    //préparation de la demande d'autorisation
    val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) {
        isGranted ->
        //si l'utilisateur autorise l'application, alors je lance l'appel
        if(isGranted){
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:0606060606"))
            startActivity(intent)
        }else{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:0606060606"))
            startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button  = findViewById<Button>(R.id.buttonGo)
        val buttonCall = findViewById<Button>(R.id.buttonCall)

        button.setOnClickListener {

//            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.fr")).also {
//                intent ->
//                startActivity(intent)
//            }

            //ouvre une appli qui gère des coordonnées GPS
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("geo:48.04, -1.69")
            ).also {
                startActivity(it)
            }
        }

        buttonCall.setOnClickListener {
            //Lancement de la demande d'autorisation
            requestPermissionLauncher.launch(android.Manifest.permission.CALL_PHONE)
        }
    }
}