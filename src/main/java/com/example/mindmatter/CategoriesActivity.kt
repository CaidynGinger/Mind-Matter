package com.example.mindmatter

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.util.Log
import androidx.cardview.widget.CardView
import com.example.mindmatter.databinding.ActivityCategoriesBinding
import com.google.gson.Gson

class CategoriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoriesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // get scores

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

// Store data


// Retrieve data

        val username = sharedPreferences.getString("username", "user")

        Log.d("AAA Welcome: ", username.toString())

        binding.dspUsername.setText("Welcome, $username")

        val chemistryCard = findViewById<CardView>(R.id.ChemistryCard)

        chemistryCard.setOnClickListener {
            // Create an intent to navigate to the second activity
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subjectId", 620)
            intent.putExtra("username", username.toString())
            startActivity(intent)
        }

        val physicsCard = findViewById<CardView>(R.id.PhysicsCard)

        physicsCard.setOnClickListener {
            // Create an intent to navigate to the second activity
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subjectId", 625)
            intent.putExtra("username", username.toString())
            startActivity(intent)
        }

        val biologyCard = findViewById<CardView>(R.id.BiologyCard)

        biologyCard.setOnClickListener {
            // Create an intent to navigate to the second activity
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subjectId", 610)
            intent.putExtra("username", username.toString())
            startActivity(intent)
        }

        binding.settingsButton.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}