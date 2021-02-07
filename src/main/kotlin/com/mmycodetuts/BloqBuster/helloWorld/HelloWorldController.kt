package com.mmycodetuts.BloqBuster.helloWorld

import com.mmycodetuts.BloqBuster.helloWorld.viewModel.HelloWorldResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("helloWorld")
    fun getHelloWorld(): ResponseEntity<HelloWorldResponse> {
        return ResponseEntity.ok(HelloWorldResponse("Hello World!"))
    }
}