package com.demo.openapi

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import io.swagger.v3.oas.annotations.tags.Tag


@Tag(name = "demo")
@Controller("/demo")
class DemoController {

    @Get
    fun listAll(): List<Demo> = listOf(Demo(1, "Demo 1"), Demo(2, "Demo 2"))

    @Post
    fun create(demo: Demo): Demo {
        return Demo(123, demo.name)
    }

    @Put("{id}")
    fun update(id: Long, demo: Demo): Demo {
        return Demo(id, demo.name)
    }
}