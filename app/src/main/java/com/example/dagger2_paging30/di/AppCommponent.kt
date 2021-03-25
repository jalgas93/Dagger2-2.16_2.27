package com.example.dagger2_paging30.di

import android.app.Application
import com.example.dagger2_paging30.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class,AppModule::class,MainActivityModule::class]
)
interface AppCommponent : AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppCommponent
    }
     override   fun inject(app: App)

}