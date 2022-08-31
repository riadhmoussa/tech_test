package com.example.demo_android.presentation.activitys

import android.os.Bundle
import com.example.demo_android.R
import com.example.demo_android.databinding.ActivityAuthBinding
import com.example.demo_android.presentation.base.BaseActivity

class AuthActivity : BaseActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun layoutRes(): Int {
        return R.layout.activity_auth
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}