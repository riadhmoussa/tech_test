package com.example.demo_android.di.modules

import com.example.demo_android.presentation.activitys.AuthActivity
import com.example.demo_android.presentation.activitys.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Suppress("unused")
@Module
abstract class AuthActivityModule {
    @ContributesAndroidInjector(
        modules = [
            AndroidSupportInjectionModule::class,
            FragmentBuildersModule::class
        ]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}