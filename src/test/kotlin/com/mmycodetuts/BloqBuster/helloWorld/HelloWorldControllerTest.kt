package com.mmycodetuts.BloqBuster.helloWorld

import com.mmycodetuts.BloqBuster.HelloWorldController
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class HelloWorldControllerTest {

    val testObject = HelloWorldController()

    @Test
    fun `when calling get hello world then hello world is returned`() {
        val expectedResult = ResponseEntity.ok("Hello World!")

        val actualResult = testObject.getHelloWorld()

        assertEquals(expectedResult, actualResult)
    }
}