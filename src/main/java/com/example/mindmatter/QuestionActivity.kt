package com.example.mindmatter

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mindmatter.databinding.ActivityQuestionBinding
import com.example.mindmatter.models.Constants.getQuestions
import com.example.mindmatter.models.Constants.questionsList
import com.example.mindmatter.models.Question

class QuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionBinding

    private fun capitalizeFirstChar(input: String): String {
        if (input.isEmpty()) {
            return input
        }

        val firstChar = input[0].uppercaseChar()
        val restOfChars = input.substring(1)

        return "$firstChar$restOfChars"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)
        val subjectId = intent?.extras?.getInt("subjectId")

        var currentQuestionNumber = 0
        var userScore = 0
        var currentSelectedAnswer: String? = null


        if (subjectId != null) {
            getQuestions(subjectId)
        }
        val listOfQuestions:ArrayList<Question> = questionsList




        binding.dspCurrentScore.text = "Current Score $userScore/${listOfQuestions.size}"


        fun updateQuestionList(currentQuestionNumber: Int) {
            binding.questionText.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].questionText)
            binding.dspAnswerOne.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].optionOne)
            binding.dspAnswerTwo.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].optionTwo)
            binding.dspAnswerThree.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].optionThree)
            binding.dspAnswerFour.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].optionFour)
        }

        updateQuestionList(currentQuestionNumber)

        //select question

        fun cleanSelectedAnswers() {
            binding.dspAnswerOne.background = null
            binding.dspAnswerTwo.background = null
            binding.dspAnswerThree.background = null
            binding.dspAnswerFour.background = null
            currentSelectedAnswer = null
        }

        binding.dspAnswerOne.setOnClickListener {
            cleanSelectedAnswers()
            currentSelectedAnswer = listOfQuestions[currentQuestionNumber].optionOne
            binding.dspAnswerOne.setBackgroundColor(Color.parseColor("#ff6b81"))
        }
        binding.dspAnswerTwo.setOnClickListener {
            cleanSelectedAnswers()
            currentSelectedAnswer = listOfQuestions[currentQuestionNumber].optionTwo
            binding.dspAnswerTwo.setBackgroundColor(Color.parseColor("#ff6b81"))
        }
        binding.dspAnswerThree.setOnClickListener {
            cleanSelectedAnswers()
            currentSelectedAnswer = listOfQuestions[currentQuestionNumber].optionThree
            binding.dspAnswerThree.setBackgroundColor(Color.parseColor("#ff6b81"))
        }
        binding.dspAnswerFour.setOnClickListener {
            cleanSelectedAnswers()
            currentSelectedAnswer = listOfQuestions[currentQuestionNumber].optionFour
            binding.dspAnswerFour.setBackgroundColor(Color.parseColor("#ff6b81"))
        }
        // answer button click

        binding.btnNext.setOnClickListener {
            currentQuestionNumber += 1
            if (currentSelectedAnswer === null) {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_LONG).show()
            }
            else if (currentQuestionNumber == listOfQuestions.size) {

                val intent = Intent(this, QuestionScoreActivity:: class.java)
                cleanSelectedAnswers()
                val username = intent?.extras?.getString("username")
                intent.putExtra("userScore", userScore)
                Log.d("AAA list of questions", username.toString())
                intent.putExtra("totalScore", listOfQuestions.size)
                intent.putExtra("subjectId", subjectId)
                intent.putExtra("username", username)
                startActivity(intent)
                finish()
            }
            else {
                Log.d("AAA list of questions", "next q")
                if(currentSelectedAnswer === listOfQuestions[currentQuestionNumber - 1].correctAnswer) {
                    userScore += 1
                    binding.dspCurrentScore.text = "Current Score $userScore/${listOfQuestions.size}"
                    Log.d("AAA list of questions", userScore.toString())
                }
                cleanSelectedAnswers()
                updateQuestionList(currentQuestionNumber)
            }
        }
    }

}