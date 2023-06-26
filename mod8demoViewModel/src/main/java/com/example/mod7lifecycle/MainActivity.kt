package com.example.mod7lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7lifecycle.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    lateinit var vm: CounterViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val tvScore = findViewById<TextView>(R.id.tv_score)

        //vm = ViewModelProvider(this).get(CounterViewModel::class.java)
        //Récupération de l'instance du ViewModel associé
        vm = ViewModelProvider(this)[CounterViewModel::class.java]

        //j'initialise le textView au démarrage, avec la valeur 0
        //tvScore.text = vm.getCounter().toString()
        binding.vm = vm



        button.setOnClickListener {
            //j'incrémente et je renvoie la nouvelle valeur
            //tvScore.text = vm.increment().toString()

            vm.increment()
            binding.vm = vm
        }
    }


}