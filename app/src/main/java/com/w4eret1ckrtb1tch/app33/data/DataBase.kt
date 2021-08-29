package com.w4eret1ckrtb1tch.app33.data

class DataBase : Data {

    private val dataBase = listOf("one", "two", "three", "four")

    override fun getDataBase(): List<String> {
        return dataBase
    }
}