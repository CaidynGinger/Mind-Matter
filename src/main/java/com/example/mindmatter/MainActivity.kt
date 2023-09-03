package com.example.mindmatter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mindmatter.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.btnStart.setOnClickListener {
            var username = binding.etUsername.text
            Log.d(
                "AAA captured", username.toString()
            )

            if (username != null) {
                if (username.isBlank()) {
                    Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
                    Log.d(
                        "AAA Invalid username", "please fill username"
                    )
                } else {
                    Log.d(
                        "AAA captured username: ", username.toString()
                    )
                    val intent = Intent(this, CategoriesActivity:: class.java)
                    intent.putExtra("username", username.toString())

                    startActivity(intent)
                }
            }
        }
    }
}