package com.example.codecoverageissue

class ArithmeticUseCase {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun divide(a: Int, b: Int): Int {
        return if (b != 0) {
            a / b
        } else {
            0
        }
    }
}