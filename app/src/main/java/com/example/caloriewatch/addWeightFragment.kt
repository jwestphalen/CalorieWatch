package com.example.caloriewatch

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import org.w3c.dom.Text


class addWeightFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_add_weight, container, false)
        val weightView = inflater.inflate(R.layout.fragment_weight, container, false)
        val dashboardView = inflater.inflate(R.layout.fragment_dashboard,container,false)
        val currWeight = weightView.findViewById<TextView>(R.id.currWeight)
        val dashboardWeight = dashboardView.findViewById<TextView>(R.id.dashboardWeight)
        val confirmWeightButton = view.findViewById<Button>(R.id.confirmWeightBTN)
        val textField = view.findViewById<EditText>(R.id.weightField)


        confirmWeightButton.setOnClickListener {
            val weight = textField.text.toString()
            currWeight.text = weight
            dashboardWeight.text = weight

            view.findNavController()
                .navigate(R.id.addWeightFragment_returnTo_weightFragment)
        }


        return view
    }
}
