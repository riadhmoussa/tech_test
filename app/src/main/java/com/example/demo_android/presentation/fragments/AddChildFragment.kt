package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentAddChildBinding
import com.example.demo_android.databinding.FragmentCongratsOneBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject


class AddChildFragment :  BaseFragment()  {


    private lateinit var binding: FragmentAddChildBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_add_child

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddChildBinding.bind(view)
        binding.btnSkip.setOnClickListener {
            it.findNavController().navigate(R.id.action_addChildFragment_to_congratsTwoFragment)
        }
        binding.btnNext.setOnClickListener {
            it.findNavController().navigate(R.id.action_addChildFragment_to_congratsOneFragment)
        }

    }

}