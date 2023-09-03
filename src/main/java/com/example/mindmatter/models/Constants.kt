package com.example.mindmatter.models

import com.example.mindmatter.R

object Constants {
    // array for our questions
    var questionsList = ArrayList<Question>()

// function to populate our questions
    fun getQuestions(subjectId: Int) {
     questionsList.clear()
        val que1 = Question(
            1,
            "Which fuel does not produce carbon dioxide when it burns?",
            "coal",
            "hydrogen",
            "methane",
            "petrol",
            "hydrogen",
        )
        val que2 = Question(
            2,
            "In which process is carbon dioxide not formed?",
            "burning of natural gas",
            "fermentation",
            "heating lime",
            "respiration",
            "heating lime",
        )
        val que3 = Question(
            3,
            "Which air pollutant is not made when coal burns in a power station?",
            "carbon monoxide ",
            "lead compounds",
            "nitrogen oxides",
            "sulfur dioxide ",
            "lead compounds",
        )
    questionsList.add(que1)
    questionsList.add(que2)
    questionsList.add(que3)
    }
}