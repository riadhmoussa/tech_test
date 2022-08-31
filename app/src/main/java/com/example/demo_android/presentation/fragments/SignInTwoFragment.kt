package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentSigninTwoBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject


class SignInTwoFragment :  BaseFragment()  {


    private lateinit var binding: FragmentSigninTwoBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_signin_two

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSigninTwoBinding.bind(view)
        binding.btnSignIn.setOnClickListener {
            it.findNavController().navigate(R.id.action_signInTwoFragment_to_spaceChoseFragment)
        }


    }

}