package com.example.hello.core.usecases

import com.example.hello.core.Account
import reactor.core.publisher.Mono

interface AccountManagementUseCase {

    fun showAccountInformation(id: Long): Mono<Account>
}