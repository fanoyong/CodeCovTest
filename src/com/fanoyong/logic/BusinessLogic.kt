package com.fanoyong.logic

class BusinessLogic {


    fun filterEven(numbers: List<Int>): List<Int> {
        return numbers.filter { it % 2 == 0 }
    }

    fun filterTriple(number: List<Int>): List<Int> {
        return number.filter { it % 3 == 0 }
    }

}