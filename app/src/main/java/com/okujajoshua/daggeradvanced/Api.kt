package com.okujajoshua.daggeradvanced


import com.okujajoshua.daggeradvanced.repos.Repo
import com.okujajoshua.daggeradvanced.userdetails.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET("users/{user}")
    fun getUser(@Path("user") user: String): Call<User>

    @GET("users/{user}/repos")
    fun getRepos(@Path("user") user: String): Call<List<Repo>>
}