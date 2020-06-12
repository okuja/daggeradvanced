package com.okujajoshua.daggeradvanced.dagger

import com.okujajoshua.daggeradvanced.dagger.repos.ReposModule
import com.okujajoshua.daggeradvanced.dagger.users.UserDetailsModule
import com.okujajoshua.daggeradvanced.repos.ReposActivity
import com.okujajoshua.daggeradvanced.userdetails.UserDetailsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [UserDetailsModule::class])
    abstract fun userDetailsActivity() : UserDetailsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules=[ReposModule::class])
    abstract fun reposActivity() : ReposActivity

}