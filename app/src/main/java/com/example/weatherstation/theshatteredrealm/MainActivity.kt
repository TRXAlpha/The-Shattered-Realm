package com.yourname.shatteredrealm

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(16, 16, 16, 16)
        }

        val titleTextView = TextView(this).apply {
            text = "The Shattered Realm"
            textSize = 32f
            gravity = Gravity.CENTER
        }

        val newGameButton = Button(this).apply {
            text = "New Game"
            textSize = 18f
            setOnClickListener {
                // For now, just show a placeholder text
                titleTextView.text = "New Game Starting..."
            }
        }

        val loadGameButton = Button(this).apply {
            text = "Load Game"
            textSize = 18f
            // Placeholder for future load game functionality
        }

        val settingsButton = Button(this).apply {
            text = "Settings"
            textSize = 18f
            setOnClickListener {
                // Navigate to the SettingsActivity
                val intent = Intent(this@MainActivity, SettingsActivity::class.java)
                startActivity(intent)
            }
        }

        val spacer = TextView(this).apply { textSize = 16f }
        layout.addView(titleTextView)
        layout.addView(spacer)
        layout.addView(newGameButton)
        layout.addView(loadGameButton)
        layout.addView(settingsButton)

        setContentView(layout)
    }
}
