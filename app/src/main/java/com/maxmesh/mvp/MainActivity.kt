package com.maxmesh.mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maxmesh.mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: CountersPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initPresenter()
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

    private fun initPresenter() {
        presenter = CountersPresenter(this)
    }
}