package com.example.butterpos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//adapter for the food Recycler View
class foodRecyclerAdapter(foodList: ArrayList<Food>) : RecyclerView.Adapter<foodRecyclerAdapter.FoodViewHolder>() {

    //inner class provides a reference to each particular row in RecyclerView
    class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val foodName = itemView.findViewById<TextView>(R.id.food_name_label)
        //val foodPrice =... create our own price here if we cant grab one from API
        val foodImage = itemView.findViewById<ImageView>(R.id.food_picture)


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):FoodViewHolder {
        //takes a file and inflates during runtime
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_individual_row, parent, false)
        return FoodViewHolder(view)
    }
    override fun onBindViewHolder(holder:FoodViewHolder, position:Int) {
        val currentFood = AmericanFoods[position]
        holder.foodName.text = ${currentFood.strMeal}
        holder.foodImage.setImageResource(currentFood.strMealThumb)



    }
    override fun getItemCount(): Int {

        //BELOW COMMENT COPIED FROM YUSUF IN-CLASS EXAMPLE
        // Return the size of your dataset (invoked by the layout manager)

        return 12
        //also can return whatever size we decide ie. 12 food items
    }


}