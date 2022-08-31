package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentSigninOneBinding
import com.example.demo_android.presentation.base.BaseFragment

import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject


class SignInOneFragment :  BaseFragment()  {


    private lateinit var binding: FragmentSigninOneBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_signin_one

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSigninOneBinding.bind(view)

        binding.btnSignInEmail.setOnClickListener {
            it.findNavController().navigate(R.id.action_signInOneFragment_to_signInTwoFragment)
        }
        binding.btnCreateAccount.setOnClickListener {
            it.findNavController().navigate(R.id.action_signInOneFragment_to_signInThreeFragment)
        }


    }

}