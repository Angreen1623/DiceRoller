package com.example.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnRoll)


        btnRoll.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {


        val diceRoll = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.imgDice)

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        val txtNum: TextView = findViewById(R.id.txtNum)

        txtNum.text = diceRoll.toString()

    }

}