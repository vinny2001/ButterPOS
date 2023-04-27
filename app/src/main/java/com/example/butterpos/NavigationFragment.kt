package com.example.butterpos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class NavigationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation_, container, false)
    }

    //Open order when order when 'Order' button is pressed
    fun openOrder(view: View) {

    }

    //Open 'activity_order_food_screen' when order when 'Food' button is pressed
    fun openFood(view: View){

    }

    //Open [name of drinks activity] when order when 'Drinks' button is pressed
    fun openDrinks(view: View){

    }

}