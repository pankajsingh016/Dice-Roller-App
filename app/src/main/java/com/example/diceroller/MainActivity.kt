package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val diceImage:ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_1);
        // This above 3 lines will set the image as dice 1 image.

        var count=1
        //This is the lambda function.
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Roled ${count} times", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
            count += 1
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

        val diceImage:ImageView = findViewById(R.id.imageView)


        val drawableResource = when(diceRoll)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource);
        //This is demo comment
    }
}