package com.example.mod6demointentexplicite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mod6demointentexplicite.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonToLogin)

        button.setOnClickListener {
//            //création de l'intent
//            val intent = Intent(this, LoginActivity::class.java)
//            intent.putExtra("pseudo", "Sylvain")
//            //lancement de l'intent
//            startActivity(intent)

            //autre écriture avec le .also{}
            Intent(this, LoginActivity::class.java).also {
                it.putExtra("pseudo", "Sylvain")
                startActivity(it)
            }

        }

    }
}