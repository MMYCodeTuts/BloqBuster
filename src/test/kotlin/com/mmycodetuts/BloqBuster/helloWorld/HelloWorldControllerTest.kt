package com.mmycodetuts.BloqBuster.helloWorld

import com.mmycodetuts.BloqBuster.HelloWorldController
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloWorldControllerTest {

    val testObject = HelloWorldController()

    @Test
    fun `when calling get hello world then hello world is returned`() {
        val expectedResult = "Hello World!"

        val actualResult = testObject.getHelloWorld()

        assertEquals(expectedResult, actualResult)
    }
}