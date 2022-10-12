package com.example.hello.presentation

import com.example.hello.core.Account
import com.example.hello.core.usecases.AccountManagementUseCase
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject
import reactor.core.publisher.Mono

@Controller("/account")
class AccountRESTAPI {

    @Inject
    lateinit var accountManagementUseCase: AccountManagementUseCase

    @Get(uri = "/{id}")
    fun getAccount(id: Long): Mono<Account> = accountManagementUseCase.showAccountInformation(id)
}