package com.maxmesh.mvp

import android.os.Bundle
import com.maxmesh.mvp.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter by moxyPresenter { CountersPresenter(CountersModel()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClicks()
    }

    private fun initClicks() = with(binding) {
        btnOne.setOnClickListener {
            presenter.onFirstBtnClicked()
        }
        btnTwo.setOnClickListener {
            presenter.onSecondBtnClicked()
        }
        btnThree.setOnClickListener {
            presenter.onThirdBtnClicked()
        }
    }

    override fun setDigitOne(counter: String) = with(binding) {
        tvTextOne.text = counter
    }

    override fun setDigitTwo(counter: String) = with(binding) {
        tvTextTwo.text = counter
    }

    override fun setDigitThree(counter: String) = with(binding) {
        tvTextThree.text = counter
    }
}