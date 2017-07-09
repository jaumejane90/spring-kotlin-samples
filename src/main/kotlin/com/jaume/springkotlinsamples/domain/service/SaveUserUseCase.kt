package com.jaume.springkotlinsamples.domain.service

import com.jaume.springkotlinsamples.domain.User
import com.jaume.springkotlinsamples.domain.UserRepository
import com.jaume.springkotlinsamples.framework.adapter.CreateUserRestEntity
import reactor.core.publisher.Mono
import java.util.*


class SaveUserUseCase(val userRepository: UserRepository) {

    fun execute(createUserRestEntity: Mono<CreateUserRestEntity>)
            = userRepository.save(User(UUID.randomUUID().toString(), createUserRestEntity.block().name))

}
