package com.saher.recicleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SuperHeroAdapter(val superHeroList: List<Nombres>): RecyclerView.Adapter<NombresViewHolder>(){


    override fun getItemCount(): Int = superHeroList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NombresViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NombresViewHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: NombresViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item)
    }

}