package com.gugalo.puzzle_game_tutorial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LevelOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_one)

        val clickCountTextView = findViewById<TextView>(R.id.clickCounterTextView)
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)
        val nextLevelButton = findViewById<Button>(R.id.nextButton)

        var clickCount = 0
        val requiredClicksCount = 100

        // Update the text showing the click count
        fun updateClickCounterLabel() {
            clickCountTextView.text = "$clickCount / $requiredClicksCount"
        }

        // Initialize the text
        updateClickCounterLabel()

        // Handle click on the big button
        clickMeButton.setOnClickListener {
            clickCount++
            updateClickCounterLabel()

            // If we’ve reached 100 clicks, enable the "Next" button
            if (clickCount >= requiredClicksCount) {
                nextLevelButton.isEnabled = true
            }
        }

        // Handle click on the next button to go to the congratulation screen
        nextLevelButton.setOnClickListener {
            val intent = Intent(this, LevelTwoActivity::class.java)
            startActivity(intent)
        }
    }
}
