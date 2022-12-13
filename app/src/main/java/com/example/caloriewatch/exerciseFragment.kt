package com.example.caloriewatch

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.findNavController


class exerciseFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_exercise, container, false)

        val weightButton = view.findViewById<ImageButton>(R.id.logWeightBTN)
        val dashboardButton = view.findViewById<ImageButton>(R.id.dashboardBTN)
        val caloriesButton = view.findViewById<ImageButton>(R.id.logCaloriesBTN)

        dashboardButton.setOnClickListener {
            Log.w(tag,"Exercise dashboardBTN activated")
            view.findNavController()
                .navigate(R.id.exerciseFragment_goto_dashboardFragment)
        }

        caloriesButton.setOnClickListener {
            Log.w(tag,"Exercise caloriesBTN activated")
            view.findNavController()
                .navigate(R.id.exerciseFragment_goto_caloriesFragment)
        }

        weightButton.setOnClickListener {
            Log.w(tag,"Exercise weightBTN activated")
            view.findNavController()
                .navigate(R.id.exerciseFragment_goto_weightFragment)
        }

        return view
    }
}