package com.example.recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.SuperHeroAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleView()
    }

    private fun initRecycleView(){
        val manager= LinearLayoutManager(this)
        binding.rvSuperHero.layoutManager=manager
        binding.rvSuperHero.adapter=SuperHeroAdapter(SuperHeroProvider.superheroList,{onItemSelected(it)})

    }

    fun onItemSelected(superHero: SuperHero){
        Toast.makeText(this, superHero.superhero, Toast.LENGTH_SHORT).show()
    }
}