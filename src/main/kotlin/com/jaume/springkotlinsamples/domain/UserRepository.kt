package com.jaume.springkotlinsamples.domain

import reactor.core.publisher.Mono

interface UserRepository {

    fun save(user: User) : Mono<User>
    fun getById(id: String) : Mono<User>
}