package com.jaume.springkotlinsamples.framework.routes

import com.jaume.springkotlinsamples.framework.adapter.UserAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.router

@Configuration
class UserRoutes(val userAdapter: UserAdapter) {


    @Bean
    fun userRouter() = router {
        (accept(APPLICATION_JSON) and "/users").nest {
                GET("/{id}", userAdapter::getUserById)
                POST("/", userAdapter::saveUser)
            }
    }
}