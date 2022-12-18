package com.maxmesh.mvp

import moxy.MvpPresenter

class CountersPresenter(private val model: CountersModel) : MvpPresenter<MainView>()  {

    fun onFirstBtnClicked() {
        viewState.setDigitOne(model.getNewCounter(0).toString())
    }

    fun onSecondBtnClicked() {
        viewState.setDigitTwo(model.getNewCounter(1).toString())
    }

    fun onThirdBtnClicked() {
        viewState.setDigitThree(model.getNewCounter(2).toString())
    }
}