package com.example.hello.dependencies

import com.example.hello.core.Account
import com.example.hello.core.ports.AccountDatastore
import jakarta.inject.Singleton

@Singleton
class JdbcAccountDatastore : AccountDatastore {
    override fun findById(id: Long): Account {
        return Account(id, "test123")
    }
}