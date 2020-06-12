package com.okujajoshua.daggeradvanced.dagger

import com.okujajoshua.daggeradvanced.Api
import com.okujajoshua.daggeradvanced.dagger.repos.ReposSubcomponent
import com.okujajoshua.daggeradvanced.dagger.users.UserDetailsSubcomponent
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun providesRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesApi(retrofit: Retrofit): Api{
        return retrofit.create(Api::class.java)
    }
}