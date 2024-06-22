package dev.brunofelix.bookapi.controller.request

import com.fasterxml.jackson.annotation.JsonAlias

data class PutCustomerRequest(
    @JsonAlias("name")
    val name: String,

    @JsonAlias("email")
    val email: String
)