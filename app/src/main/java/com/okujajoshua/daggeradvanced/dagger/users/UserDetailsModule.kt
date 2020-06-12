package com.okujajoshua.daggeradvanced.dagger.users

import com.okujajoshua.daggeradvanced.Api
import com.okujajoshua.daggeradvanced.dagger.ActivityScope
import com.okujajoshua.daggeradvanced.userdetails.UserRepository
import com.okujajoshua.daggeradvanced.userdetails.UserRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class UserDetailsModule {
    @Provides
    @ActivityScope
    fun providesUserRepository(api: Api): UserRepository{
        return UserRepositoryImpl(api)
    }
}