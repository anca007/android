package com.example.mod4demodatabinding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mod4demodatabinding.R
import com.example.mod4demodatabinding.bo.User
import com.example.mod4demodatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user = User("To", "Toto", 10)

        binding.user = user

        var i = 0

        binding.button.setOnClickListener {
            binding.tvHello.text = "i = " + ++i
        }
    }
}