package com.w4eret1ckrtb1tch.app33.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.w4eret1ckrtb1tch.app33.data.Data

class MainActivityViewModel(private val dataBase: Data) {

    private val liveData = MutableLiveData<List<String>>()
    val getLiveData: LiveData<List<String>> get() = liveData

    fun getDataBase() {
        liveData.postValue(dataBase.getDataBase())
    }

    fun putDataBase(item: String) {
        dataBase.addData(item)
        getDataBase()
    }
}