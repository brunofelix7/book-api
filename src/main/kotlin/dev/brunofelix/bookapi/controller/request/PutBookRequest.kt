package dev.brunofelix.bookapi.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import java.math.BigDecimal

data class PutBookRequest(
    @JsonAlias("name")
    val name: String,

    @JsonAlias("price")
    val price: BigDecimal
)