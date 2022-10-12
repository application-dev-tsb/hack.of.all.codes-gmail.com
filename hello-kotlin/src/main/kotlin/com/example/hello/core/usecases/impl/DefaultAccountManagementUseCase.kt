package com.example.hello.core.usecases.impl

import com.example.hello.core.Account
import com.example.hello.core.ports.AccountDatastore
import com.example.hello.core.usecases.AccountManagementUseCase
import jakarta.inject.Inject
import jakarta.inject.Singleton
import reactor.core.publisher.Mono

@Singleton
class DefaultAccountManagementUseCase : AccountManagementUseCase {

    @Inject
    lateinit var accountDatastore: AccountDatastore

    override fun showAccountInformation(id: Long): Mono<Account> {
        return accountDatastore.findById(id)
    }
}