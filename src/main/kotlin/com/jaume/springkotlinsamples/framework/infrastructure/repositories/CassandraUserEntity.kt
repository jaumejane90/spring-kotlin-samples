package com.jaume.springkotlinsamples.framework.infrastructure.repositories

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table("users")
data class CassandraUserEntity(
        @PrimaryKey val id: String,
        val name: String)