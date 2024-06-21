package dev.brunofelix.bookapi.domain.entity

import dev.brunofelix.bookapi.domain.enums.BookStatus
import jakarta.persistence.*
import java.math.BigDecimal

@Entity(name = "books")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column
    val name: String,

    @Column
    val price: BigDecimal,

    @Column
    @Enumerated(EnumType.STRING)
    val status: BookStatus? = null,

    @ManyToOne
    @JoinColumn(name = "customer_id")
    val customer: Customer? = null
)