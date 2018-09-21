package com.fanoyong.logic

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test


/** Tests [BusinessLogic] */
class BusinessLogicTest {

    private val subject = BusinessLogic()

    @Test
    fun `should return only even`() {
        val actual = subject.filterEven(listOf(1, 2))

        assertThat(actual, hasItem(2))
    }

    @Test
    fun `should return empty if no even`() {
        val actual = subject.filterEven(listOf(1))

        assertThat(actual.size, equalTo(0))
    }

    @Test
    fun `should return only triple`() {

        val actual = subject.filterTriple(listOf(1, 2, 3))

        assertThat(actual, hasItem(3))
    }

    @Test
    fun `should return empty if no triple`() {
        val actual = subject.filterTriple(listOf(1, 2))

        assertThat(actual.size, equalTo(0))
    }
}
