package com.example.meditation.spashscreen

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.meditation.R
import com.example.meditation.onboard.OnBoardingActivity


class SplashScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val intent = Intent(this, OnBoardingActivity::class.java)
        startActivity(intent)
        finish()

    }

}