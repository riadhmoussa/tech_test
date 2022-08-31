package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentSpaceChoseBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject


class SpaceChoseFragment :  BaseFragment()  {


    private lateinit var binding: FragmentSpaceChoseBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_space_chose

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSpaceChoseBinding.bind(view)
        binding.btnChild.setOnClickListener {
            it.findNavController().navigate(R.id.action_spaceChoseFragment_to_welcomeFragment)
        }
        binding.btnParent.setOnClickListener {
            it.findNavController().navigate(R.id.action_spaceChoseFragment_to_welcomeFragment)
        }

    }

}