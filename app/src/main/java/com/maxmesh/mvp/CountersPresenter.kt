package com.maxmesh.mvp

class CountersPresenter(private val view: MainView) {

    private val model = CountersModel()

    fun onFirstBtnClicked() {
        view.setDigitOne(model.getNewCounter(0).toString())
    }

    fun onSecondBtnClicked() {
        view.setDigitTwo(model.getNewCounter(1).toString())
    }

    fun onThirdBtnClicked() {
        view.setDigitThree(model.getNewCounter(2).toString())
    }
}