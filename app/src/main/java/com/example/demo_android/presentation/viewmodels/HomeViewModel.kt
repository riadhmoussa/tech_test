package com.example.demo_android.presentation.viewmodels


import androidx.lifecycle.ViewModel
import com.example.demo_android.data.repository.MainRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val repository: MainRepository) : ViewModel()
sealed class MainStateEvent