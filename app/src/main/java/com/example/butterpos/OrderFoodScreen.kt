package com.example.butterpos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OrderFoodScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val foodRecyclerView = findViewById<RecyclerView>(R.id.food_recycler_view)
        foodRecyclerView.adapter = foodRecyclerAdapter()
        foodRecyclerView.layoutManager = LinearLayoutManager(this)

        setContentView(R.layout.activity_order_food_screen)
    }
}