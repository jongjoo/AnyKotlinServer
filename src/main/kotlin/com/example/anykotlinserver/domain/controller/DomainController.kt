package com.example.anykotlinserver.domain.controller

import com.example.anykotlinserver.domain.service.DomainService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
@RequestMapping("/domain")
class DomainController(
    private val domainService: DomainService,
) {

    companion object {
        val logger: Logger = LoggerFactory.getLogger(DomainController.javaClass)
        class Response {
            data class Domain(
                val id: String,
                val name: String,
                val createdDate: LocalDateTime,
            )
        }

    }

    @PostMapping("/postDomain/{id}")
    fun postDomain(
        @PathVariable("id") id: String
    ): Response.Domain {
        var name: String
        name = "jj"
        val returnData = domainService.saveDomain(id, name)
        logger.info("logger => {}", returnData)
        return Response.Domain(
            returnData.id,
            returnData.name,
            returnData.createdDate
        )
    }

    @GetMapping("/getDomain/{id}")
    fun getDomain(
        @PathVariable("id") id: String
    ): Response.Domain {
        var name: String = "jj"

        return Response.Domain(
            id,
            name,
            LocalDateTime.now()
        )
    }
}