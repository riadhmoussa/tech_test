package com.example.demo_android.data.repository


import com.example.demo_android.api.Appervice
import com.example.demo_android.utils.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class MainRepository @Inject constructor(private val appservice: Appervice)
