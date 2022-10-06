package com.example.hello.dependencies

import com.example.hello.core.ports.AccountDatastore
import jakarta.inject.Singleton

@Singleton
class JdbcAccountDatastore : AccountDatastore {
}