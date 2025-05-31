package com.example.shadrinvr_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.EditText;
import com.example.shadrinvr_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val colors = arrayOf(Color.parseColor("#964B00"), Color.GRAY, Color.RED)

    private var currentColorIndex = 0
    private var currentNumber = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.numberEditText.setText(getString(R.string.initial_number))

        binding.changeColorButton.setOnClickListener {
            changeSquareColor()
        }

        binding.incrementButton.setOnClickListener {
            incrementNumber()
        }
    }

    private fun changeSquareColor() {
        currentColorIndex = (currentColorIndex + 1) % colors.size
        binding.squareView.setBackgroundColor(colors[currentColorIndex])
    }

    private fun incrementNumber() {
        currentNumber += 6
        if (currentNumber > 36) {
            currentNumber = 6
        }
        binding.numberEditText.setText(currentNumber.toString())
    }

}