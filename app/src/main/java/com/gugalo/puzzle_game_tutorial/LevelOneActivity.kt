package com.gugalo.puzzle_game_tutorial

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LevelOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_one)

        val nextLevelButton = findViewById<Button>(R.id.nextButton)

        var clickCount = 0
        val requiredClicksCount = 100
    }
}
