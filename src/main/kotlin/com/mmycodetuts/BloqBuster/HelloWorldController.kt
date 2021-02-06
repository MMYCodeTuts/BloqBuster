package com.mmycodetuts.BloqBuster

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("helloWorld")
    fun getHelloWorld(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World!")
    }
}