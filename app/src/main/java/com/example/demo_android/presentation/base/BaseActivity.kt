package com.example.demo_android.presentation.base

import android.os.Bundle
import android.os.PersistableBundle

import androidx.annotation.LayoutRes
import butterknife.ButterKnife

import dagger.android.support.DaggerAppCompatActivity


abstract class BaseActivity : DaggerAppCompatActivity() {
    @LayoutRes
    protected abstract fun layoutRes(): Int
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(layoutRes())
        ButterKnife.bind(this)

    }

}