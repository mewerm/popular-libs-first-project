package com.maxmesh.mvp

class CountersModel {

    private val firstCount = 0
    private val secondCount = 0
    private val thirdCount = 0

    private val counters = mutableListOf(firstCount, secondCount, thirdCount)

    fun getNewCounter(position: Int) = counters[position]++

}