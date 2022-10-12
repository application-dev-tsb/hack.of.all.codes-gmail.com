package com.example.hello.dependencies.entities

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity("account")
data class AccountEntity(var username: String) {

    @GeneratedValue
    @Id
    var id: Long? = null
}