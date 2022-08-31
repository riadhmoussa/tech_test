package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentCongratsTwoBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import com.example.demo_android.utils.Root
import javax.inject.Inject


class CongratsTwoFragment :  BaseFragment()  {


    private lateinit var binding: FragmentCongratsTwoBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_congrats_two

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCongratsTwoBinding.bind(view)
        binding.btnDashboard.setOnClickListener {
            Root.goToDashboard(requireActivity())
        }


    }

}