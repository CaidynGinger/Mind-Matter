package com.example.mindmatter.models

// model for question
data class Question(
    val id: Int,
    val questionText: String,
//    val icon: Int, //all images should be ints
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: String,
)

