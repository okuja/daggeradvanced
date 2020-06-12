package com.okujajoshua.daggeradvanced.repos

import com.google.gson.annotations.SerializedName

data class Repo(
    @SerializedName("name") val name: String
)