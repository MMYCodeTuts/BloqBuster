package com.mmycodetuts.BloqBuster.helloWorld

import io.restassured.RestAssured
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class HelloWorldTest {

    @Test
    fun `when calling the hello world endpoint then a 200 response with the message is sent to the client`() {
        RestAssured
                .get("http://localhost:8080/helloWorld")
                .then()
                .log()
                .body()
                .body("message", equalTo("Hello World!"))
                .statusCode(200).assertThat()
    }
}