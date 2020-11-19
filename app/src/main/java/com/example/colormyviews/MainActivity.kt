package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {

        val boxOneTextView = findViewById<TextView>(R.id.box_one)
        val boxtwoTextView = findViewById<TextView>(R.id.box_two)
        val boxthreeTextView = findViewById<TextView>(R.id.box_three)
        val boxfourTextView = findViewById<TextView>(R.id.box_four)
        val boxfiveTextView = findViewById<TextView>(R.id.box_five)

        val clickableViews : List<View> = listOf(boxOneTextView,boxtwoTextView,boxthreeTextView,boxfourTextView,boxfiveTextView)

        for(item in clickableViews){
            item.setOnClickListener{
                makeColored(it)
            }
        }
    }

   private fun makeColored(view: View) {
        when(view.id){
            //Boxes using colors for background
            R.id.box_one -> view.setBackgroundColor(Color.GRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android color resourses for background
            R.id.box_three ->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four ->view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five ->view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}