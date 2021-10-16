package com.example.meditation.main.retrofit.api

import com.example.meditation.main.retrofit.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}