package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentWelcomeBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject


class WelcomeFragment :  BaseFragment()  {


    private lateinit var binding: FragmentWelcomeBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_welcome

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWelcomeBinding.bind(view)
        binding.btnStart.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_addDeviceFragment)
        }


    }

}