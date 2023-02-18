package com.example.retrofit_send_a_simple_get_request_for_notes.repository

import com.example.retrofit_send_a_simple_get_request_for_notes.api.RetrofitInstance
import com.example.retrofit_send_a_simple_get_request_for_notes.model.Post
import retrofit2.Retrofit

class Repository {
    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }
}