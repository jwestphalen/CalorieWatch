package com.example.caloriewatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var weightButton = findViewById<ImageButton>(R.id.logWeightBTN)
        weightButton.setOnClickListener {
            setContentView(R.layout.fragment_weight)
        }

    }
}