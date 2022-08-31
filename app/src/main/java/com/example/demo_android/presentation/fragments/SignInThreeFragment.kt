package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentSigninThreeBinding
import com.example.demo_android.databinding.FragmentSigninTwoBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject


class SignInThreeFragment :  BaseFragment()  {


    private lateinit var binding: FragmentSigninThreeBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_signin_three

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSigninThreeBinding.bind(view)
        binding.btnSignUp.setOnClickListener {
            it.findNavController().navigate(R.id.action_signInThreeFragment_to_spaceChoseFragment)
        }

    }

}