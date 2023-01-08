package com.hometech.testingdemo.utils


import junit.framework.TestCase.assertEquals
import org.junit.Test

class HelperTest {

    @Test
    fun isPallindrome_inputString_hello_expectedFalse() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("hello")
        //Assert
        assertEquals(false, result)
    }

    @Test
    fun isPallindrome_inputString_level_expectedTrue() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("level")
        //Assert
        assertEquals(true, result)
    }

    @Test
    fun isPallindrome_inputString_a_expectedTrue() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("a")
        //Assert
        assertEquals(true, result)
    }

    @Test
    fun isPallindrome_inputString_Empty_expectedTrue() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("")
        //Assert
        assertEquals(true, result)
    }
}