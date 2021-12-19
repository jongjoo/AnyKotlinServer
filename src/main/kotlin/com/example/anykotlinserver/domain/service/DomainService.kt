package com.example.anykotlinserver.domain.service

import com.example.anykotlinserver.domain.entity.Domain
import com.example.anykotlinserver.domain.repository.DomainRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class DomainService(
    private val domainRepository: DomainRepository,
) {

    fun saveDomain(
        id: String,
        name: String,
    ) : Domain{

        val domain = Domain(id, name, LocalDateTime.now())

        return domainRepository.save(domain)
    }
}