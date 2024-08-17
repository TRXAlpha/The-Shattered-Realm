package com.yourname.shatteredrealm

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create a layout for the settings screen
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 16, 16, 16)
        }

        // Create a TextView for the settings title
        val titleTextView = TextView(this).apply {
            text = "Settings"
            textSize = 24f
        }

        // Create a Switch for sound effects
        val soundSwitch = Switch(this).apply {
            text = "Sound Effects"
            isChecked = true // Default value
        }

        // Set up the switch listener to handle changes
        soundSwitch.setOnCheckedChangeListener { _: CompoundButton, isChecked: Boolean ->
            // Save the sound setting (for now, just print the value)
            println("Sound Effects: $isChecked")
        }

        // Add views to the layout
        layout.addView(titleTextView)
        layout.addView(soundSwitch)

        // Set the layout as the content view
        setContentView(layout)
    }
}
