package com.example.dagger2_paging30

import android.app.Activity
import android.app.Application
import com.example.dagger2_paging30.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector

import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
       AppInjector.init(this)
    }

    override fun androidInjector() = dispatchingAndroidInjector


}