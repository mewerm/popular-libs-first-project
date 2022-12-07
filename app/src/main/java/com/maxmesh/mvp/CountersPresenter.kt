package com.maxmesh.mvp

class CountersPresenter(private val view: MainView) {

    private val model = CountersModel()

    fun onCounterClick(id: Int) {

        when (id) {
            R.id.btnOne -> {
                val newValue = model.getNewCounter(0)
                view.setText(newValue.toString(), 0)
            }
            R.id.btnTwo -> {
                val newValue = model.getNewCounter(1)
                view.setText(newValue.toString(), 1)
            }
            R.id.btnThree -> {
                val newValue = model.getNewCounter(2)
                view.setText(newValue.toString(),2)
            }
        }
    }
}