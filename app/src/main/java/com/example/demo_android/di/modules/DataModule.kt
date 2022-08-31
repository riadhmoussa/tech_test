package com.example.demo_android.di.modules

import com.example.demo_android.api.Appervice
import com.example.demo_android.data.repository.MainRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
object DataModule {

    @Singleton
    @Provides
    fun providesRepository(appervice: Appervice): MainRepository =
        MainRepository(appervice)
}