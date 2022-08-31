package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentDashboardBinding
import com.example.demo_android.databinding.FragmentPhoneUsageBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject

class PhoneUsageFragment :  BaseFragment()  {


    private lateinit var binding: FragmentPhoneUsageBinding


    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_phone_usage

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPhoneUsageBinding.bind(view)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


    }

}