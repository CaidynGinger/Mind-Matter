package com.example.mindmatter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.cardview.widget.CardView
import com.example.mindmatter.databinding.ActivityCategoriesBinding

class CategoriesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoriesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent?.extras?.getString("username")

        Log.d("AAA Welcome: ", username.toString())

        binding.dspUsername.setText("Welcome, $username")

        val cardView = findViewById<CardView>(R.id.ChemistryCard)

        cardView.setOnClickListener {
            // Create an intent to navigate to the second activity
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("subjectId", 620)
            intent.putExtra("username", username.toString())
            startActivity(intent)
        }

    }
}