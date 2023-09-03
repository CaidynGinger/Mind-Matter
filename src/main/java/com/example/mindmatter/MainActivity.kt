package com.example.mindmatter

import android.content.Context
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
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        setContentView(view)

        binding.btnStart.setOnClickListener {
            var username = binding.etUsername.text

            if (username != null) {
                if (username.isBlank()) {
                    Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
                    Log.d(
                        "AAA Invalid username", "please fill username"
                    )
                } else {
                    val value = sharedPreferences.getString("Username", "user")

                    val editor = sharedPreferences.edit()
                    editor.putString("username", username.toString())
                    editor.apply()

                    val intent = Intent(this, CategoriesActivity:: class.java)
                    startActivity(intent)
                }
            }
        }
    }
}