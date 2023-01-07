package com.hometech.testingdemo.utils


import junit.framework.TestCase.assertEquals
import org.junit.Test

class HelperTest {

    @Test
    fun isPallindrome() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("hello")
        //Assert
        assertEquals(false,result)
    }
}