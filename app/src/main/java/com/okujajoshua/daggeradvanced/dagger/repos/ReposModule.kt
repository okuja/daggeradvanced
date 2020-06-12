package com.okujajoshua.daggeradvanced.dagger.repos

import com.okujajoshua.daggeradvanced.Api
import com.okujajoshua.daggeradvanced.dagger.ActivityScope
import com.okujajoshua.daggeradvanced.repos.ReposRepository
import com.okujajoshua.daggeradvanced.repos.ReposRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class ReposModule{
    @Provides
    @ActivityScope
    fun providesReposRepository(api:Api) : ReposRepository{
        return ReposRepositoryImpl(api)
    }
}