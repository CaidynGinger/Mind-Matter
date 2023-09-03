package com.example.mindmatter.models

import com.example.mindmatter.R

object Constants {
    // array for our questions
    var questionsList = ArrayList<Question>()

// function to populate our questions
    fun getQuestionsChemistry() {
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
    val que4 = Question(
        4,
        "In many countries river water is used for the washing of clothes.\n" +
                "The same water is not considered to be safe for drinking.\n" +
                "Why is it not safe for drinking? ",
        "because river water contains dissolved salts",
        "because river water may contain harmful bacteria",
        "because river water may contain small particles of sand",
        "because river water may contain soap from washing clothes",
        "because river water may contain harmful bacteria",
    )
    val que5 = Question(
        5,
        "Petroleum is a mixture of hydrocarbons which can be separated into fractions using fractional\n" +
                "distillation.\n" +
                "Which fraction is used as fuel in jet engines?",
        "bitumen",
        "gasoline",
        "kerosene",
        "naphtha",
        "kerosene",
    )
    questionsList.add(que1)
    questionsList.add(que2)
    questionsList.add(que3)
    questionsList.add(que4)
    questionsList.add(que5)
    }

    fun getQuestionsPhysics() {
        questionsList.clear()
        val que1 = Question(
            1,
            "In which situation is no resultant force needed? ",
            "a car changing direction at a steady speed",
            "a car moving in a straight line at a steady speed",
            "a car slowing down",
            "a car speeding up",
            "a car moving in a straight line at a steady speed",
        )
        val que2 = Question(
            2,
            "When a bicycle lamp is switched on, what is the useful energy change within the battery? ",
            "chemical energy to electrical energy",
            "electrical energy to chemical energy",
            "electrical energy to light energy",
            "light energy to chemical energy",
            "chemical energy to electrical energy",
        )
        val que3 = Question(
            3,
            "Two methods by which thermal energy can be transferred are conduction and radiation.\n" +
                    "Which statement is correct?",
            "Conduction involves density changes in fluids.",
            "Conduction only occurs in solids.",
            "Radiation cannot occur in a vacuum.",
            "Radiation involves electromagnetic waves.",
            "Radiation involves electromagnetic waves.",
        )
        val que4 = Question(
            4,
            "An intruder alarm sensor detects that a human is warmer than his surroundings.\n" +
                    "Which type of electromagnetic wave does the sensor detect?",
            "infra-red",
            "radio",
            "ultraviolet",
            "visible light",
            "infra-red",
        )
        val que5 = Question(
            5,
            "In a cathode-ray tube, a hot tungsten cathode releases particles by thermionic emission.\n" +
                    "What are these particles? ",
            "α-particles",
            "electrons",
            "protons",
            "tungsten atoms",
            "electrons",
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
    }

    fun getQuestionsBiology() {
        questionsList.clear()
        val que1 = Question(
            1,
            "Which process provides the raw materials needed for tissue repair?",
            "excretion",
            "growth",
            "nutrition",
            "respiration",
            "nutrition",
        )
        val que2 = Question(
            2,
            "Which group does not contain animals that are arthropods?",
            "annelids",
            "arachnids",
            "crustaceans",
            "insects",
            "annelids",
        )
        val que3 = Question(
            3,
            "Which statement is correct for all catalysts? ",
            "They are enzymes.",
            "They are proteins.",
            "They speed up chemical reactions.",
            "They work in living organisms.",
            "They speed up chemical reactions.",
        )
        val que4 = Question(
            4,
            "How does sweating cool the body?",
            "Sweating causes vasodilation.",
            "Sweating decreases the water content of the blood.",
            "Urea and salt are lost from the body in sweat.",
            "Water in sweat evaporates from the skin.",
            "Water in sweat evaporates from the skin.",
        )
        val que5 = Question(
            5,
            "Which environmental factor is not always a requirement for seed germination?",
            "light",
            "oxygen",
            "suitable temperature",
            "water",
            "light",
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
    }
}