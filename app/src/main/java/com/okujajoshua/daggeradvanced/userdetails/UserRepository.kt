package com.okujajoshua.daggeradvanced.userdetails


interface UserRepository {

    fun getUser(username: String, onSuccess: (user: User) -> Unit, onFailure: (t: Throwable) -> Unit)
    
}