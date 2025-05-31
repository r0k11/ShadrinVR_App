package com.example.shadrinvr_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var squareView: View
    private lateinit var changeColorButton: Button

    private var currentColorIndex = 0
    private val colors = arrayOf(Color.parseColor("#964B00"), Color.GRAY, Color.RED)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        squareView = findViewById(R.id.squareView)
        changeColorButton = findViewById(R.id.changeColorButton)

        changeColorButton.setOnClickListener {
            changeSquareColor()
        }
    }

    private fun changeSquareColor() {
        currentColorIndex = (currentColorIndex + 1) % colors.size
        squareView.setBackgroundColor(colors[currentColorIndex])
    }
}