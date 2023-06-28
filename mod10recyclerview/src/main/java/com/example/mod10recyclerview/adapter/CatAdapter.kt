package com.example.mod10recyclerview.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10recyclerview.bo.Cat
import com.example.mod10recyclerview.databinding.TemplateCatLineBinding

class CatAdapter(val alCat : ArrayList<Cat>, val listener : (cat : Cat) -> Unit) : Adapter<CatAdapter.CatVH>() {

    class CatVH(val binding : TemplateCatLineBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatVH {
        val binding = TemplateCatLineBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CatVH(binding)
    }

    override fun getItemCount(): Int {
        return alCat.size
    }

    override fun onBindViewHolder(holder: CatVH, position: Int) {
        holder.binding.cat = alCat[position]
        //ajout d'évènements sur le bouton
        holder.itemView.setOnClickListener {
            listener.invoke(alCat[position])
        }

    }

}