package com.okujajoshua.daggeradvanced.dagger

import com.okujajoshua.daggeradvanced.Api
import com.okujajoshua.daggeradvanced.repos.ReposRepository
import com.okujajoshua.daggeradvanced.repos.ReposRepositoryImpl
import com.okujajoshua.daggeradvanced.userdetails.UserRepository
import com.okujajoshua.daggeradvanced.userdetails.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun providesUserRepository(api:Api) : UserRepository{
        return UserRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun providesReposRepository(api: Api) : ReposRepository{
        return ReposRepositoryImpl(api)
    }

}