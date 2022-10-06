package com.example.hello.presentation

import com.example.hello.core.Account
import com.example.hello.core.usecases.AccountManagementUseCase
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

@Controller("/account")
class AccountRESTAPI {

    @Inject
    lateinit var accountManagementUseCase: AccountManagementUseCase

    @Get(uri = "/{id}")
    fun getAccount(id: Long): Account = accountManagementUseCase.showAccountInformation(id)
}