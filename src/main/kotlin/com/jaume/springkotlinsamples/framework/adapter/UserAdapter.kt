package com.jaume.springkotlinsamples.framework.adapter

import com.jaume.springkotlinsamples.domain.service.GetUserUseCase
import com.jaume.springkotlinsamples.domain.service.SaveUserUseCase
import org.springframework.http.MediaType.APPLICATION_JSON_UTF8
import org.springframework.web.reactive.function.server.*
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

class UserAdapter(val getUserUseCase: GetUserUseCase, val saveUserUseCase: SaveUserUseCase) {

    fun getUserById(req: ServerRequest) : Mono<ServerResponse> {
        return ok().contentType(APPLICATION_JSON_UTF8).body(getUserUseCase.execute(req.pathVariable("id")))
    }

    fun saveUser(req: ServerRequest) : Mono<ServerResponse> {
        return ok().contentType(APPLICATION_JSON_UTF8).body(
                saveUserUseCase.execute(req.bodyToMono<CreateUserRestEntity>()))
    }
}
