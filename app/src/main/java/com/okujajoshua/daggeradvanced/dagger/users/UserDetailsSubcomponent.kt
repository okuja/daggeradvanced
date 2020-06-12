package com.okujajoshua.daggeradvanced.dagger.users

import com.okujajoshua.daggeradvanced.dagger.ActivityScope
import com.okujajoshua.daggeradvanced.userdetails.UserDetailsActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent (
    modules = [
        UserDetailsModule::class
    ]
)
interface UserDetailsSubcomponent {

    @Subcomponent.Builder
    interface Builder {
        fun build() : UserDetailsSubcomponent
    }

    fun inject(activity: UserDetailsActivity)
}