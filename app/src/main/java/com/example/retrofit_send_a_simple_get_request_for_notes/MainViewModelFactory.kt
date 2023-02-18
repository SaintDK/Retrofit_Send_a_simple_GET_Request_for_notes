package com.example.retrofit_send_a_simple_get_request_for_notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit_send_a_simple_get_request_for_notes.repository.Repository

class MainViewModelFactory(
    private val repository: Repository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel(repository) as T
        }
}