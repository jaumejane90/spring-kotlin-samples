package com.jaume.springkotlinsamples.framework

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringKotlinSamplesApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinSamplesApplication::class.java, *args)
}
