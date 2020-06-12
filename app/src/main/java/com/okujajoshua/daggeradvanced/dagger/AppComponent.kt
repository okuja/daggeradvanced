package com.okujajoshua.daggeradvanced.dagger

import com.okujajoshua.daggeradvanced.dagger.repos.ReposSubcomponent
import com.okujajoshua.daggeradvanced.dagger.users.UserDetailsSubcomponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

    fun userDetailsSubcomponent() : UserDetailsSubcomponent.Builder

    fun reposSubcomponent() : ReposSubcomponent.Builder

}