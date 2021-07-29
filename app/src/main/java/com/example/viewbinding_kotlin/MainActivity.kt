package com.example.viewbinding_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding:ActivityMainBinding= ActivityMainBinding.inflate(layoutInflater)

        val rootActivityLayout=binding.root
        super.onCreate(savedInstanceState)
        setContentView(rootActivityLayout)
        binding.text1.text=getString(R.string.text_1)
    }
}