package com.example.dagger2_paging30

import android.app.Activity
import android.app.Application
import com.example.dagger2_paging30.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
       AppInjector.init(this)
    }
    override fun activityInjector() = dispatchingAndroidInjector

//Dagger 2.16


}