package com.example.anykotlinserver.domain.repository

import com.example.anykotlinserver.domain.entity.Domain
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DomainRepository : JpaRepository<Domain, String> {
}