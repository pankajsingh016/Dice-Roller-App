package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        //This is the lambda function.
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Roled", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
        }
    }

    //Dice class in kotlin.
    class Dice(val numsides: Int) {
        fun roll(): Int {
            return (1..numsides).random()
        }
    }
    //private function rollDice() sets the outcome into the android screen.
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        val dice2 = Dice( 6)
        val result2 = dice2.roll()
        val resultSecondTextView: TextView = findViewById(R.id.textView2)
        resultSecondTextView.text = result2.toString()
        //This is demo comment
    }
}