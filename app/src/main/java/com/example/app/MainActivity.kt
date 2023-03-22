package com.example.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnRoll)
        val txtNum: TextView = findViewById(R.id.txtNum)

        btnRoll.setOnClickListener {
            val randomInt = (1..6).random()
            rollDice()
            txtNum.text = randomInt.toString()
        }

    }

    private fun rollDice() {

        Toast.makeText(this, "button clicked",
        Toast.LENGTH_SHORT).show()

    }

}