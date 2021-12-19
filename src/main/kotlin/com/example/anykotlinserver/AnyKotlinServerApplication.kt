package com.example.anykotlinserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnyKotlinServerApplication

fun main(args: Array<String>) {
    runApplication<AnyKotlinServerApplication>(*args)
}
