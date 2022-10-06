package com.example.hello.core.ports

import com.example.hello.core.Account

interface AccountDatastore {

    fun findById(id: Long): Account
}