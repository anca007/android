package com.example.mod9room.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.mod9room.R
import com.example.mod9room.bo.BoardGame
import com.example.mod9room.bo.Theme
import com.example.mod9room.bo.Type

class MainActivity : AppCompatActivity() {

    private val vm : BoardGameViewModel by viewModels() { BoardGameViewModel.Factory }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val game = BoardGame(
            0,
            "Splendor",
            3,
            8,
            Type.CARDS,
            Theme.FANTASTIC)

       vm.addGame(game).observe(this){
           vm.getGame(it)
           vm.boardGame.observe(this){
               Log.i("sly", "onCreate: " + it)
           }
       }

    }
}