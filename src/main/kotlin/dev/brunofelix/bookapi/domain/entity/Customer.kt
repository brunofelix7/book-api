package dev.brunofelix.bookapi.domain.entity

import jakarta.persistence.*

@Entity(name = "customers")
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column
    val name: String,

    @Column
    val email: String
)