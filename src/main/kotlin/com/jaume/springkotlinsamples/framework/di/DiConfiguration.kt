package com.jaume.springkotlinsamples.framework.di

import com.jaume.springkotlinsamples.domain.UserRepository
import com.jaume.springkotlinsamples.domain.service.GetUserUseCase
import com.jaume.springkotlinsamples.domain.service.SaveUserUseCase
import com.jaume.springkotlinsamples.framework.adapter.UserAdapter
import com.jaume.springkotlinsamples.framework.infrastructure.repositories.CassandraSpringRepository
import com.jaume.springkotlinsamples.framework.infrastructure.repositories.CassandraUserRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DiConfiguration {

    @Bean
    fun userRepository(cassandraSpringRepository: CassandraSpringRepository) : UserRepository = CassandraUserRepository(cassandraSpringRepository)

    @Bean
    fun saveUserUserCase(userRepository: UserRepository) = SaveUserUseCase(userRepository)

    @Bean
    fun getUserUseCase(userRepository: UserRepository) = GetUserUseCase(userRepository)

    @Bean
    fun userAdapter(getUserUseCase: GetUserUseCase, saveUserUseCase: SaveUserUseCase)
            = UserAdapter(getUserUseCase, saveUserUseCase)
}