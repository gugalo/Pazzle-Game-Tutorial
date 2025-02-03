package com.gugalo.puzzle_game_tutorial

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LevelThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_three)

        val nextLevelButton = findViewById<Button>(R.id.nextLevelButton)

        // Check current orientation:
        val currentOrientation = resources.configuration.orientation
        if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Show the "Next Level" button if device is horizontal
            nextLevelButton.visibility = View.VISIBLE
        } else {
            // Hide the button if device is vertical
            nextLevelButton.visibility = View.GONE
        }

        // Set click listener to navigate to next level (Level Four)
        nextLevelButton.setOnClickListener {
            val intent = Intent(this, CongratulationsActivity::class.java)
            startActivity(intent)
        }
    }
}
