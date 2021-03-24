package com.example.dagger2_paging30.di

import com.example.dagger2_paging30.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(
        modules = [FragmentBuildersModule::class]

    )
    abstract fun contributeMainActivity():MainActivity

}