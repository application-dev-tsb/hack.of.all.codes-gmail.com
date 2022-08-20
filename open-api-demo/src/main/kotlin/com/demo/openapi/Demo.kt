package com.demo.openapi

import io.micronaut.core.annotation.Introspected

@Introspected
data class Demo(val id: Long, val name: String)