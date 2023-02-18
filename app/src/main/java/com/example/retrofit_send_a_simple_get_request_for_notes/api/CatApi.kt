package com.example.retrofit_send_a_simple_get_request_for_notes.api

import com.example.retrofit_send_a_simple_get_request_for_notes.model.Post
import retrofit2.http.GET

interface CatApi {
    @GET("/fact")
    suspend fun getPost(): Post
}