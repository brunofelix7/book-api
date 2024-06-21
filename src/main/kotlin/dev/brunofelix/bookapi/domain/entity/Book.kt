package dev.brunofelix.bookapi.domain.entity

import dev.brunofelix.bookapi.domain.enums.BookStatus
import jakarta.persistence.*
import java.math.BigDecimal

@Entity(name = "books")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column
    var name: String,

    @Column
    var price: BigDecimal,

    @Column
    @Enumerated(EnumType.STRING)
    var status: BookStatus? = null,

    @ManyToOne
    @JoinColumn(name = "customer_id")
    var customer: Customer? = null
)