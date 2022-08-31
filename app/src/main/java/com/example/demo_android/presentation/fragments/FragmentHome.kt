package com.example.demo_android.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.demo_android.R
import com.example.demo_android.databinding.FragmentCongratsTwoBinding
import com.example.demo_android.databinding.FragmentHomeBinding
import com.example.demo_android.presentation.base.BaseFragment
import com.example.demo_android.presentation.viewmodels.SignInViewModel
import javax.inject.Inject


class FragmentHome :  BaseFragment()  {


    private lateinit var binding: FragmentHomeBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SignInViewModel by viewModels {
        viewModelFactory
    }

    override fun layoutRes(): Int {
        return R.layout.fragment_home

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)



    }


    /*private fun showActivityDialog(activity: ActivityResponse) {
        when (activity.type) {
            "1" -> {
                this.findNavController().navigate(R.id.action_fragmentHome_to_dashboardFragment)
            }
            "2" -> {
                this.findNavController().navigate(R.id.action_fragmentHome_to_phoneUsageFragment)
            }
            "4" -> {
                this.findNavController().navigate(R.id.action_fragmentHome_to_socialMediFragment)
            }
            "6" -> {
                this.findNavController().navigate(R.id.action_fragmentHome_to_alertsFragment)
            }
        }
    }*/
}