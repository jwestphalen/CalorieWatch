package com.example.caloriewatch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class WeightFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_weight, container, false)
    }

}