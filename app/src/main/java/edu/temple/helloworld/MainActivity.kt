package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameEditView: EditText
    lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize properties with associated views
        displayTextView = findViewById(R.id.displayTextView)
        nameEditView = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)

        // Add a click listener to the button
        clickMeButton.setOnClickListener {
            // Get the entered text from the EditText
            val enteredText = nameEditView.text.toString()

            // Update the TextView with the entered text
            val greeting = "Hello, $enteredText!"

            // Actually display the greeting string in the TextView
            displayTextView.text = greeting
        }
    }
}