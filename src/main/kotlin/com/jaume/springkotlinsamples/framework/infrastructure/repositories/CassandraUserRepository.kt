package com.jaume.springkotlinsamples.framework.infrastructure.repositories

import com.jaume.springkotlinsamples.domain.User
import com.jaume.springkotlinsamples.domain.UserRepository
import reactor.core.publisher.Mono

class CassandraUserRepository(val cassandraSpringRepository: CassandraSpringRepository) : UserRepository {

    override fun save(user: User): Mono<User> {
        return cassandraSpringRepository.save(CassandraUserEntity(user.id, user.name)).map { User(it.id, it.name) }
    }

    override fun getById(id: String): Mono<User> {
        return cassandraSpringRepository.findById(id).map { User(it.id, it.name) }
    }
}