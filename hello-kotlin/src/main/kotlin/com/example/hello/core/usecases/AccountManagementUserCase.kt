package com.example.hello.core.usecases

import com.example.hello.core.Account

interface AccountManagementUserCase {

    fun showAccountInformation(id: Long): Account
}