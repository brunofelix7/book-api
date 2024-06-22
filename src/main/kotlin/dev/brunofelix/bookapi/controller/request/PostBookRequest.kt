package dev.brunofelix.bookapi.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import java.math.BigDecimal

data class PostBookRequest(
    @JsonAlias("name")
    val name: String,

    @JsonAlias("price")
    val price: BigDecimal,

    @JsonAlias("customer_id")
    val customerId: Int
)