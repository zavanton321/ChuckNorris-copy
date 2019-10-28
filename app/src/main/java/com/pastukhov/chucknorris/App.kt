package com.pastukhov.chucknorris

import android.app.Application
import com.pastukhov.chucknorris.di.AppComponent
import com.pastukhov.chucknorris.di.DaggerAppComponent

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    private fun initializeDagger() {
        appComponent = DaggerAppComponent.builder()
            .build()
    }
}