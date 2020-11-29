package com.springfox.bug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
class BugApplication

fun main(args: Array<String>) {
    runApplication<BugApplication>(*args)
}
