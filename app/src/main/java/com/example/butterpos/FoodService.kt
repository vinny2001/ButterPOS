package com.example.butterpos

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodService {
    //decide here what api to access and write necessary signature

    //below is restfull API for search by different options
    //https://www.themealdb.com/api/json/v1/1/filter.php?a=American

    @GET(".")
    fun getFoodInfo(@Query("cuisine")Cuisine:String): Call<Food>
}