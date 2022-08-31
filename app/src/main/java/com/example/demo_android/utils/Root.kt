package com.example.demo_android.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.demo_android.presentation.activitys.MainActivity

class Root {

    companion object{
        fun goToDashboard(activity: Activity){
            val intent = Intent(activity, MainActivity::class.java)
            activity.startActivity(intent)
            activity.finish()
        }
    }
}