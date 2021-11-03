package com.example.tweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tweet.databinding.ActivityMainBinding


lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView6.setOnClickListener {
            Toast.makeText(this, "comment", Toast.LENGTH_SHORT).show()
        }
        binding.imageView7.setOnClickListener {
            Toast.makeText(this, "Retweet", Toast.LENGTH_SHORT).show()
        }
        binding.imageView8.setOnClickListener {
            Toast.makeText(this, "like", Toast.LENGTH_SHORT).show()
        }
        binding.imageView9.setOnClickListener {
            Toast.makeText(this, "Shared", Toast.LENGTH_SHORT).show()
        }
        


        }
}