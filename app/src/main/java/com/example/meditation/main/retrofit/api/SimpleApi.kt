package com.example.meditation.main.retrofit.api

import com.example.meditation.main.retrofit.model.Quotes
import retrofit2.http.GET

interface SimpleApi {

    @GET("/quotes")
    suspend fun getQu() : Quotes
}