package com.jaume.springkotlinsamples.framework.adapter

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateUserRestEntity(
        @JsonProperty("name") val name: String)
