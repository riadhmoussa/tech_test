package com.example.demo_android.presentation.viewmodels


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demo_android.data.repository.MainRepository
import javax.inject.Inject

class SignInViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

    var usageGoogle = MutableLiveData<Boolean>(true)
    var usageCamera = MutableLiveData<Boolean>(false)

    fun onChangeUsageGoogle(){
        if(usageGoogle.value==true){
            usageGoogle.postValue(false)
        }else{
            usageGoogle.postValue(true)
        }
    }
    fun onChangeUsageCamera(){
        if(usageCamera.value==true){
            usageCamera.postValue(false)
        }else{
            usageCamera.postValue(true)
        }

    }
}
