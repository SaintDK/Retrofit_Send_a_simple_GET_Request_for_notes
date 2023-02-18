package com.example.retrofit_send_a_simple_get_request_for_notes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit_send_a_simple_get_request_for_notes.model.Post
import com.example.retrofit_send_a_simple_get_request_for_notes.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val  repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Post> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch{
            val response = repository.getPost()
            myResponse.value = response
        }
    }
}