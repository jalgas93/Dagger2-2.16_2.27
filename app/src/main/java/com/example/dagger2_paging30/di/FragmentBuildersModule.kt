package com.example.dagger2_paging30.di

import com.example.dagger2_paging30.presentations.first.FirstFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributesFirstFragment():FirstFragment
}