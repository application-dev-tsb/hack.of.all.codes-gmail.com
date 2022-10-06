package com.example.hello.core.usecases.impl

import com.example.hello.core.Account
import com.example.hello.core.ports.AccountDatastore
import com.example.hello.core.usecases.AccountManagementUserCase
import jakarta.inject.Singleton

@Singleton
class DefaultAccountManagementUseCase : AccountManagementUserCase {

    lateinit var accountDatastore: AccountDatastore

    override fun showAccountInformation(id: Long): Account {
        TODO("Not yet implemented")
    }
}