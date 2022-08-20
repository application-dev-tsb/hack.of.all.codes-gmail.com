package com.demo.openapi

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/demo")
class DemoController {
    @Get(value = "/", produces = [MediaType.APPLICATION_JSON])
    fun demoGet(): List<Demo> = listOf(Demo(1, "Demo 1"), Demo(2, "Demo 2"))

}