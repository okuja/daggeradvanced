package com.okujajoshua.daggeradvanced

import android.app.Application
import com.okujajoshua.daggeradvanced.dagger.AppComponent
import com.okujajoshua.daggeradvanced.dagger.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .build()
    }
}

lateinit var appComponent : AppComponent