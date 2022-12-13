package com.example.caloriewatch

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.findNavController



class WeightFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_weight, container, false)

        val dashboardButton = view.findViewById<ImageButton>(R.id.dashboardBTN)
        val caloriesButton = view.findViewById<ImageButton>(R.id.logCaloriesBTN)
        val exerciseButton = view.findViewById<ImageButton>(R.id.logExerciseBTN)
        val addWeightButton = view.findViewById<Button>(R.id.addWeightBTN)

        dashboardButton.setOnClickListener {
            Log.w(tag,"weight dashboardBTN activated")
            view.findNavController()
                .navigate(R.id.weightFragment_goto_dashboardFragment)
        }

        caloriesButton.setOnClickListener {
            Log.w(tag,"weight caloriesBTN activated")
            view.findNavController()
                .navigate(R.id.weightFragment_goto_caloriesFragment)
        }

        exerciseButton.setOnClickListener {
            Log.w(tag,"weight exerciseBTN activated")
            view.findNavController()
                .navigate(R.id.weightFragment_goto_exerciseFragment)
        }

        addWeightButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.weightFragment_goto_addWeightFragment)
        }


        return view
    }

}