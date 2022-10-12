package com.example.hello.dependencies.repositories

import com.example.hello.dependencies.entities.AccountEntity
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository
import reactor.core.publisher.Mono


@R2dbcRepository(dialect = Dialect.POSTGRES)
interface AccountEntityRepository : ReactiveStreamsCrudRepository<AccountEntity, Long> {

    override fun findById(id: Long): Mono<AccountEntity>
}