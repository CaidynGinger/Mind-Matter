package com.example.mindmatter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
        var currentSelectedAnswer = ""


        if (subjectId != null) {
            getQuestions(subjectId)
        }
        val listOfQuestions:ArrayList<Question> = questionsList
        Log.d("AAA list of questions", listOfQuestions[0].questionText)



        fun updateQuestionList(currentQuestionNumber: Int) {
            binding.questionText.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].questionText)
            binding.dspAnswerOne.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].optionOne)
            binding.dspAnswerTwo.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].optionTwo)
            binding.dspAnswerThree.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].optionThree)
            binding.dspAnswerFour.text = capitalizeFirstChar(listOfQuestions[currentQuestionNumber].optionFour)
        }

        updateQuestionList(currentQuestionNumber)

        //select question

        binding.dspAnswerOne.setOnClickListener {
            binding.dspAnswerOne.setBackgroundColor(Color.parseColor("#ff6b81"))
            currentSelectedAnswer = listOfQuestions[currentQuestionNumber].optionOne
        }
        binding.dspAnswerTwo.setOnClickListener {
            binding.dspAnswerTwo.setBackgroundColor(Color.parseColor("#ff6b81"))
            currentSelectedAnswer = listOfQuestions[currentQuestionNumber].optionTwo


        }
        binding.dspAnswerThree.setOnClickListener {
            binding.dspAnswerThree.setBackgroundColor(Color.parseColor("#ff6b81"))
            currentSelectedAnswer = listOfQuestions[currentQuestionNumber].optionThree


        }
        binding.dspAnswerFour.setOnClickListener {
            binding.dspAnswerFour.setBackgroundColor(Color.parseColor("#ff6b81"))
            currentSelectedAnswer = listOfQuestions[currentQuestionNumber].optionFour
        }
        // answer button click
    }

}