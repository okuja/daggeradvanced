package com.okujajoshua.daggeradvanced.dagger.repos

import com.okujajoshua.daggeradvanced.dagger.ActivityScope
import com.okujajoshua.daggeradvanced.repos.ReposActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [
        ReposModule::class
    ]
)
interface ReposSubcomponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): ReposSubcomponent
    }

    fun inject(activity: ReposActivity)
}