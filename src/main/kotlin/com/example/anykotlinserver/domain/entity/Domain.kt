package com.example.anykotlinserver.domain.entity

import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Domain(
    @Id
    val id: String,

    val name: String,

    @CreatedDate
    val createdDate: LocalDateTime,
)
