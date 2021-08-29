package com.w4eret1ckrtb1tch.app33.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.w4eret1ckrtb1tch.app33.App
import com.w4eret1ckrtb1tch.app33.R
import com.w4eret1ckrtb1tch.app33.databinding.ActivityMainBinding
import com.w4eret1ckrtb1tch.app33.presenter.Presenter
import com.w4eret1ckrtb1tch.app33.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity(), View {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: Presenter
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        presenter = App.instance.presenter
        presenter.attachActivity(this)

        viewModel = App.instance.viewModel

        viewModel.getLiveData.observe(this) { list ->
            val text = list.joinToString(separator = "+") { it }
            binding.textView.text = text
        }
    }

    override fun onStart() {
        super.onStart()

        binding.buttonSetView.setOnClickListener {
            //presenter.getListFromDataBase() //mvp
            viewModel.getDataBase()
        }

        binding.buttonAddText.setOnClickListener {
            val text = binding.editText.text.toString()
            viewModel.putDataBase(text)
        }

    }


    override fun setListForView(list: List<String>) {
        val text = list.joinToString(separator = "-") { it }
        binding.textView.text = text
    }
}