package com.example.butterpos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class OrderFoodScreen : AppCompatActivity() {
    val BASE_URL = "https://www.themealdb.com/api/json/v1/1/filter.php?a=American"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_food_screen)

        val foodList = ArrayList<Food>()
        val adapter = foodRecyclerAdapter(foodList)

        val foodRecyclerView = findViewById<RecyclerView>(R.id.food_recycler_view)
        foodRecyclerView.adapter = adapter
        foodRecyclerView.layoutManager = LinearLayoutManager(this)


        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val randomUserAPI = retrofitBuilder.create(FoodService::class.java)
    }
}