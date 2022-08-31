package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentConfirmProfileBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject



class ConfirmProfileFragment :  BaseFragment()  {


    private lateinit var binding: FragmentConfirmProfileBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_confirm_profile

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentConfirmProfileBinding.bind(view)
        binding.btnAddNewChild.setOnClickListener {
            it.findNavController().navigate(R.id.action_confirmProfileFragment_to_addChildFragment)
        }

        binding.btnContinue.setOnClickListener {
            it.findNavController().navigate(R.id.action_confirmProfileFragment_to_congratsTwoFragment)
        }

    }

}