package com.example.meditation.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.meditation.R
import com.example.meditation.main.MainActivity
import com.example.meditation.onboard.RegisterActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun main(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun regystr(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}