package com.example.recyclerview.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero

class SuperHeroAdapter(private val superheroList: List<SuperHero>, private val onClickListener: (SuperHero)-> Unit) :
    RecyclerView.Adapter<SuperHeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layautInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layautInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount() = superheroList.size


    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
       val item = superheroList[position]
        holder.render(item, onClickListener)
    }
}