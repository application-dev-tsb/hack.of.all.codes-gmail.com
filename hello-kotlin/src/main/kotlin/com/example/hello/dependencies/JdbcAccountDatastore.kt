package com.example.hello.dependencies

import com.example.hello.core.Account
import com.example.hello.core.ports.AccountDatastore
import com.example.hello.dependencies.repositories.AccountEntityRepository
import io.micronaut.context.annotation.Executable
import jakarta.inject.Inject
import jakarta.inject.Singleton
import reactor.core.publisher.Mono

@Singleton
class JdbcAccountDatastore : AccountDatastore {

    @Inject
    lateinit var accountEntityRepository: AccountEntityRepository

    @Executable
    override fun findById(id: Long): Mono<Account> {
        return accountEntityRepository.findById(id).map { Account(it.id, it.username) }
    }
}