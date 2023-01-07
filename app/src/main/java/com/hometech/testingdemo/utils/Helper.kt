package com.hometech.testingdemo.utils

class Helper {

    fun isPallindrome(inputString: String): Boolean {
        var i = 0
        var j = inputString.length - 1
        var result = true

        while (i < j) {
            if (inputString[i] != inputString[j]) {
                result = false
                break
            }
            i++
            j++
        }
        return result
    }

}