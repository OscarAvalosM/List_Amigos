package com.saher.recicleview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saher.recicleview.databinding.ItemSuperheroBinding

class NombresViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    private var binding= ItemSuperheroBinding.bind(view)

    fun render(superHero: Nombres){
        binding.tvSuperHeroName.text = superHero.nombres
        binding.tvPublisher.text = superHero.descripsion
        binding.tvRealName.text = superHero.pasatiempos
        Glide.with(binding.ivSuperHero.context).load(superHero.image).into(binding.ivSuperHero)


    }
}