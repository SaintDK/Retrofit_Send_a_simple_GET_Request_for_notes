package com.example.retrofit_send_a_simple_get_request_for_notes.model

import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("fact")
    val factAboutCats: String
)
