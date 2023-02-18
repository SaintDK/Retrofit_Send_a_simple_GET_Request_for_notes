package com.example.retrofit_send_a_simple_get_request_for_notes.api

import com.example.retrofit_send_a_simple_get_request_for_notes.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: CatApi by lazy {
        retrofit.create(CatApi::class.java)
    }

}