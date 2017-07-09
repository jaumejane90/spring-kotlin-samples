package com.jaume.springkotlinsamples.framework.infrastructure.repositories

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository

interface CassandraSpringRepository : ReactiveCassandraRepository<CassandraUserEntity, String>
