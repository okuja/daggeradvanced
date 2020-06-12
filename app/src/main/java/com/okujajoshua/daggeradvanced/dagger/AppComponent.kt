package com.okujajoshua.daggeradvanced.dagger

import com.okujajoshua.daggeradvanced.MainActivity
import com.okujajoshua.daggeradvanced.repos.ReposActivity
import com.okujajoshua.daggeradvanced.userdetails.UserDetailsActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent {

    fun inject(activity: UserDetailsActivity)

    fun inject(activity: ReposActivity)
}