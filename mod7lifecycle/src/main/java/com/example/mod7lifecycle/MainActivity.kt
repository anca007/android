package com.example.mod7lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    var cpt = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "onCreate: ")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            findViewById<TextView>(R.id.tv_score).text = (++cpt).toString()
        }
    }

    //sauvegarde des données avant la destruction
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("cpt", cpt)
        Log.i(TAG, "onSaveInstanceState: ")
    }

    //récupération des données au moment de la reconstruction
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState: ")
        cpt = savedInstanceState.getInt("cpt")
        findViewById<TextView>(R.id.tv_score).text = cpt.toString()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
    }
    
    
    
    
    
    
    
    
    
    
    
    
}