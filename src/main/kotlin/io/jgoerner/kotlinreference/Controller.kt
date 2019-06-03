package io.jgoerner.kotlinreference

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class EchoController {

    @GetMapping("/echo")
    fun echo(@RequestParam msg: String?) = msg ?: "Echo"
}