package com.example.mod10recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mod10recyclerview.adapter.CatAdapter
import com.example.mod10recyclerview.bo.Cat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //données à afficher
        val alCat = arrayListOf<Cat>(
            Cat("Felix", "Noir", "Bleu", 4),
            Cat("Milou", "Blanc", "Bleu", 5),
            Cat("Garfield", "Noir", "Bleu", 6),
            Cat("Canelle", "Noir", "Bleu", 8),
            Cat("Maïtai", "Gris", "Bleu", 10),
            Cat("Loot", "Noir", "Jaune", 8),
            Cat("Wookie", "Tricolore", "Vert", 2),
            Cat("Pépite", "Tigré", "Jaune", 4),
            Cat("Feu vert", "Blanc", "Vert", 40),
            Cat("Miss Teigne", "Moche", "Marron", 4),
            Cat("Berlioz", "Noir", "Bleu", 0),
            Cat("Toulouse", "Roux", "Jaune", 4),
            Cat("Marie", "Blanc", "Revolver", 6),
            Cat("Potté", "Roux", "Vert", 35),
            Cat("Foulcan", "Noir", "Bleu", 4),
            Cat("Zouzou", "Gris", "Vert", 40)
        )

        //définir l'adpater pour le recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.adapter = CatAdapter(alCat){
            Toast.makeText(this, it.name, Toast.LENGTH_LONG).show()
        }


        //définis la manière d'afficher les éléments au sein du recyclerView
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        //recyclerView.layoutManager = LinearLayoutManager(this)








    }
}