package com.example.demo_android.di.modules

import com.example.demo_android.presentation.fragments.*
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeSignInOneFragment(): SignInOneFragment

    @ContributesAndroidInjector
    abstract fun contributeSignInTwoFragment(): SignInTwoFragment

    @ContributesAndroidInjector
    abstract fun contributeSignInThreeFragment(): SignInThreeFragment

    @ContributesAndroidInjector
    abstract fun contributeAddDeviceFragment(): AddDeviceFragment

    @ContributesAndroidInjector
    abstract fun contributeAddProfileFragment(): AddProfileFragment

    @ContributesAndroidInjector
    abstract fun contributeConfirmProfileFragment(): ConfirmProfileFragment

    @ContributesAndroidInjector
    abstract fun contributeSpaceChoseFragment(): SpaceChoseFragment

    @ContributesAndroidInjector
    abstract fun contributeWelcomeFragment(): WelcomeFragment

    @ContributesAndroidInjector
    abstract fun contributeAddChildFragment(): AddChildFragment

    @ContributesAndroidInjector
    abstract fun contributeCongratsOneFragment(): CongratsOneFragment

    @ContributesAndroidInjector
    abstract fun contributeCongratsTwoFragment(): CongratsTwoFragment

    @ContributesAndroidInjector
    abstract fun contributeFragmentHome(): FragmentHome

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): DashboardFragment

    @ContributesAndroidInjector
    abstract fun contributePhoneUsageFragment(): PhoneUsageFragment

    @ContributesAndroidInjector
    abstract fun contributeSocialMediFragment(): SocialMediFragment

    @ContributesAndroidInjector
    abstract fun contributeAlertsFragment(): AlertsFragment

}
