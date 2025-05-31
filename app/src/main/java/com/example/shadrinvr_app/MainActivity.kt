package com.example.shadrinvr_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.EditText;

class MainActivity : AppCompatActivity() {
    private lateinit var squareView: View
    private lateinit var changeColorButton: Button
    private val colors = arrayOf(Color.parseColor("#964B00"), Color.GRAY, Color.RED)

    private lateinit var numberEditText: EditText
    private lateinit var incrementButton: Button
    private var currentColorIndex = 0
    private var currentNumber = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        squareView = findViewById(R.id.squareView)
        changeColorButton = findViewById(R.id.changeColorButton)
        numberEditText = findViewById(R.id.numberEditText)
        incrementButton = findViewById(R.id.incrementButton)

        numberEditText.setText(currentNumber.toString())

        changeColorButton.setOnClickListener {
            changeSquareColor()
        }

        incrementButton.setOnClickListener {
            incrementNumber()
        }
    }

    private fun changeSquareColor() {
        currentColorIndex = (currentColorIndex + 1) % colors.size
        squareView.setBackgroundColor(colors[currentColorIndex])
    }

    private fun incrementNumber() {
        currentNumber += 6
        if (currentNumber > 36) {
            currentNumber = 6
        }
        numberEditText.setText(currentNumber.toString())
    }

}