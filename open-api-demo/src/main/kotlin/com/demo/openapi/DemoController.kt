package com.demo.openapi

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/demo")
class DemoController {

    init {
        println("Something")
    }

    @Get(value = "/something", produces = [MediaType.APPLICATION_JSON])
    fun demoGet(): Demo = Demo("test")

}