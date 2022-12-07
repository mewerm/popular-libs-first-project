package com.maxmesh.mvp

class CountersModel {

    private val counters = mutableListOf(0, 0, 0)

    fun getCurrentCounter(position: Int) = counters[position]

    fun getNewCounter(position: Int) = counters[position]++

    fun changeCounter(position: Int, value: Int){
        counters[position] = value
    }
}