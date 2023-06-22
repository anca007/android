package com.example.mod4demofindviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

private const val TAG = "MainActivity"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv_hello)
        val et = findViewById<EditText>(R.id.et_name)
        val rating = findViewById<RatingBar>(R.id.ratingBar)
        val btn = findViewById<Button>(R.id.button)

        tv.text = "Bonjour !"
        et.setText("Comment ça va ?")
        rating.rating = 3f

        btn.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_700))

//        btn.setOnClickListener(fun(it){
//            it.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
//        })

        btn.setOnClickListener {
            Log.i(TAG, "onCreate: clic sur le bouton")
            var txt : String = et.text.toString()
            Toast.makeText(this, txt, Toast.LENGTH_LONG).show()
        }


    }
}