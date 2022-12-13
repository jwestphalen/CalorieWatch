package com.example.caloriewatch

import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.findNavController

class caloriesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_calories, container, false)

        val weightButton = view.findViewById<ImageButton>(R.id.logWeightBTN)
        val exerciseButton = view.findViewById<ImageButton>(R.id.logExerciseBTN)
        val dashboardButton = view.findViewById<ImageButton>(R.id.dashboardBTN)

        dashboardButton.setOnClickListener {
            Log.w(tag,"calories dashboardBTN activated")
            view.findNavController()
                .navigate(R.id.caloriesFragment_goto_dashboardFragment)
        }

        weightButton.setOnClickListener {
            Log.w(tag,"calories weightBTN activated")
            view.findNavController()
                .navigate(R.id.caloriesFragment_goto_weightFragment)
        }

        exerciseButton.setOnClickListener {
            Log.w(tag,"calories exerciseBTN activated")
            view.findNavController()
                .navigate(R.id.caloriesFragment_goto_exerciseFragment)
        }
        return view
    }
}