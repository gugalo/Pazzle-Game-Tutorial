package com.gugalo.puzzle_game_tutorial

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LevelTwoActivity : AppCompatActivity() {

    private lateinit var passwordEditText: EditText
    private lateinit var nextLevelButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_two)

        passwordEditText = findViewById(R.id.passwordInputView)
        nextLevelButton = findViewById(R.id.nextLevelButton)

        // Watch for changes in the EditText
        passwordEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                // Check if user input matches "password"
                if (s.toString() == "password") {
                    nextLevelButton.isEnabled = true
                } else {
                    nextLevelButton.isEnabled = false
                }
            }
        })

        // Navigate to the next screen when the button is enabled and clicked
        nextLevelButton.setOnClickListener {
            val intent = Intent(this, LevelThreeActivity::class.java)
            startActivity(intent)
        }
    }
}
