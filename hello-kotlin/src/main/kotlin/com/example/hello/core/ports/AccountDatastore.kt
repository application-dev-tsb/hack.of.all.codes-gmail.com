package com.example.hello.core.ports

import com.example.hello.core.Account
import reactor.core.publisher.Mono

interface AccountDatastore {

    fun findById(id: Long): Mono<Account>
}