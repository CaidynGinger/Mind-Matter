package com.example.mindmatter

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.mindmatter.databinding.ActivityQuestionScoreBinding
import com.google.gson.Gson

class QuestionScoreActivity : AppCompatActivity() {

    class UserScoreData(
        val username: String?,
        val userScore: Int?,
        val subjectId: Int?
    )

    private lateinit var binding: ActivityQuestionScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionScoreBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)
        val userScore = intent?.extras?.getInt("userScore")
        val totalScore = intent?.extras?.getInt("totalScore")

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        val username = sharedPreferences.getString("username", "user")

        binding.dspScore.text =
            "Well done $username your score was $userScore out of $totalScore unfortunately you did not beat the high score."
        binding.dspBeatHighScore.text =
            "Well done $username you Beat the high score of $totalScore with a score of $userScore."
        binding.dspBeatHighScore.visibility = View.GONE
        binding.dspScore.visibility = View.GONE

        if (userScore != null) {
            if (userScore > 1) {
                binding.dspBeatHighScore.visibility = View.VISIBLE
            } else {
                binding.dspScore.visibility = View.VISIBLE

            }
        }
        binding.backToCategories.setOnClickListener {
            val intent = Intent(this, CategoriesActivity:: class.java)
            startActivity(intent)
            finish()
        }



    }
}