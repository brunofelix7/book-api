package dev.brunofelix.bookapi.domain.entity

import jakarta.persistence.*

@Entity(name = "customers")
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column
    var name: String,

    @Column
    var email: String
)