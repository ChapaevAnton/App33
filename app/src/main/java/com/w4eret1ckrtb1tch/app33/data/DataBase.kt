package com.w4eret1ckrtb1tch.app33.data

class DataBase : Data {

    private val dataBase = mutableListOf("one", "two", "three", "four")

    override fun getDataBase(): List<String> {
        return dataBase
    }

    override fun addData(item: String) {
        dataBase.add(item)
    }
}