package com.example.hello.core.usecases

import com.example.hello.core.Account

interface AccountManagementUseCase {

    fun showAccountInformation(id: Long): Account
}