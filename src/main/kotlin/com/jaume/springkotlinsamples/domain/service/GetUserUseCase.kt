package com.jaume.springkotlinsamples.domain.service

import com.jaume.springkotlinsamples.domain.UserRepository


class GetUserUseCase(val userRepository: UserRepository) {

    fun execute(userId: String) = userRepository.getById(userId)
}