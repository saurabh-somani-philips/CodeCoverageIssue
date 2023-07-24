package com.example.codecoverageissue

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ArithmeticUseCaseTest {

    private lateinit var useCase: ArithmeticUseCase

    @Before
    fun setUp() {
        useCase = ArithmeticUseCase()
    }

    @Test
    fun add() {
        val result = useCase.add(5, 2)
        assertEquals(7, result)
    }

    @Test
    fun multiply() {
        val result = useCase.multiply(5, 2)
        assertEquals(10, result)
    }

    @Test
    fun subtract() {
        val result = useCase.subtract(5, 2)
        assertEquals(3, result)
    }

    @Test
    fun divide() {
        val result = useCase.divide(5, 2)
        assertEquals(2, result)
    }
}