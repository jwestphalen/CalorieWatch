package com.example.caloriewatch

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.findNavController

class DashboardFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val weightButton = view.findViewById<ImageButton>(R.id.logWeightBTN)
        val caloriesButton = view.findViewById<ImageButton>(R.id.logCaloriesBTN)
        val exerciseButton = view.findViewById<ImageButton>(R.id.logExerciseBTN)

        weightButton.setOnClickListener {
            Log.w(tag,"Dashboard logWeightBTN activated")
            view.findNavController()
                .navigate(R.id.dashboardFragment_goto_weightFragment)
        }

        caloriesButton.setOnClickListener {
            Log.w(tag, "Dashboard logCaloriesBTN activated")
            view.findNavController()
                .navigate(R.id.dashboardFragment_goto_caloriesFragment)
        }

        exerciseButton.setOnClickListener {
            Log.w(tag, "Dashboard logExerciseBTN activated")
            view.findNavController()
                .navigate(R.id.dashboardFragment_goto_exerciseFragment)
        }


        return view
    }

}