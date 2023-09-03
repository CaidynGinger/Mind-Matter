package com.example.mindmatter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mindmatter.databinding.ActivitySettingsBinding


class SettingsActivity : AppCompatActivity() {
    lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.back.setOnClickListener{
            val intent = Intent(this, CategoriesActivity:: class.java)
            startActivity(intent)
            finish()
        }

        binding.resetSettings.setOnClickListener{
            Toast.makeText(this, "Settings have been reset", Toast.LENGTH_LONG).show()
        }

        binding.btnGithubLink.setOnClickListener {
            val url = "https://github.com/CaidynGinger"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent);
        }
    }
}