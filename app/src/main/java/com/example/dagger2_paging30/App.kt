package com.example.dagger2_paging30

import android.app.Activity
import android.app.Application
import com.example.dagger2_paging30.di.AppInjector
import com.example.dagger2_paging30.di.DaggerAppCommponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class App : DaggerApplication() {

    private val applicationInjector = DaggerAppCommponent.builder().application(this).build()
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector


}