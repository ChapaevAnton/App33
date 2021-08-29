package com.w4eret1ckrtb1tch.app33.presenter

import android.app.Activity

interface Presenter {

    fun attachActivity(activity: Activity)
    fun getListFromDataBase()
}