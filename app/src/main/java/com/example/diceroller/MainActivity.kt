package com.example.diceroller
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBar

lateinit var image : ImageView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //changes App Bar Color
        val actionBar : ActionBar? = getSupportActionBar()
        val colorDrawable : ColorDrawable? = ColorDrawable(Color.parseColor("#0F9D58"))
        if (actionBar != null) {
            actionBar.setBackgroundDrawable(colorDrawable)
        }
        /////
        val button: Button = findViewById(R.id.button)
        button.setTextColor(Color.parseColor("#0F9D58"))
        image = findViewById(R.id.dice_image)
        button.setOnClickListener {roll()}
    }
}
fun roll(){
    val randomNumber = (1..6).random()
    val newImage = when (randomNumber) {
        1 -> R.drawable.dice1
        2 -> R.drawable.dice2
        3 -> R.drawable.dice3
        4 -> R.drawable.dice4
        5 -> R.drawable.dice5
        else -> R.drawable.dice6
    }
    image.setImageResource(newImage)
}
