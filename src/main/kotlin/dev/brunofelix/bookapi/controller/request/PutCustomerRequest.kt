package dev.brunofelix.bookapi.controller.request

data class PutCustomerRequest(
    val name: String,
    val email: String
)