package com.w4eret1ckrtb1tch.app33.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.w4eret1ckrtb1tch.app33.App
import com.w4eret1ckrtb1tch.app33.R
import com.w4eret1ckrtb1tch.app33.databinding.ActivityMainBinding
import com.w4eret1ckrtb1tch.app33.presenter.Presenter

class MainActivity : AppCompatActivity(), View {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        presenter = App.instance.presenter
        presenter.attachActivity(this)
        binding.buttonView.setOnClickListener {
            presenter.getListFromDataBase()
        }
    }


    override fun setListForView(list: List<String>) {
        val text = list.joinToString(separator = "-") { it }
        binding.textView.text = text
    }
}