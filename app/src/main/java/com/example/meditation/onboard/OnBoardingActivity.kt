package com.example.meditation.onboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.meditation.R
import com.example.meditation.login.LoginActivity

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
    }

    fun next(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun glysh(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

}