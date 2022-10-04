package com.example.hello

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/account")
class AccountRESTAPI {

    @Get(uri = "/{id}")
    fun getAccount(id: Long): Account = Account(id, "test")
}