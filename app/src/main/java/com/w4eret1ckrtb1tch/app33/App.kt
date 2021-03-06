package com.w4eret1ckrtb1tch.app33

import android.app.Application
import com.w4eret1ckrtb1tch.app33.data.DataBase
import com.w4eret1ckrtb1tch.app33.data.Data
import com.w4eret1ckrtb1tch.app33.presenter.MainActivityPresenter
import com.w4eret1ckrtb1tch.app33.presenter.Presenter
import com.w4eret1ckrtb1tch.app33.viewmodel.MainActivityViewModel

class App : Application() {

    lateinit var data: Data

    //mvp
    lateinit var presenter: Presenter

    //mvvm
    lateinit var viewModel: MainActivityViewModel

    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        data = DataBase()
        presenter = MainActivityPresenter(data)
        viewModel = MainActivityViewModel(data)
    }
}