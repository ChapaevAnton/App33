package com.w4eret1ckrtb1tch.app33.presenter

import android.app.Activity
import com.w4eret1ckrtb1tch.app33.data.Data
import com.w4eret1ckrtb1tch.app33.view.MainActivity

class MainActivityPresenter(private val data: Data) :Presenter {

    private lateinit var activity: MainActivity

    override fun attachActivity(activity: Activity) {
        this.activity = activity as MainActivity
    }

    override fun getListFromDataBase() {
        val list = data.getDataBase()
        activity.setListForView(list)
    }
}