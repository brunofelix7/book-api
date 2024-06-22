package dev.brunofelix.bookapi.util.extension

import dev.brunofelix.bookapi.controller.request.PostBookRequest
import dev.brunofelix.bookapi.controller.request.PostCustomerRequest
import dev.brunofelix.bookapi.controller.request.PutCustomerRequest
import dev.brunofelix.bookapi.domain.entity.Book
import dev.brunofelix.bookapi.domain.entity.Customer
import dev.brunofelix.bookapi.domain.enums.BookStatus

fun PostCustomerRequest.toCustomer(): Customer {
    return Customer(name = this.name, email = this.email)
}

fun PutCustomerRequest.toCustomer(id: Int): Customer {
    return Customer(id = id, name = this.name, email = this.email)
}

fun PostBookRequest.toBook(customer: Customer): Book {
    return Book(
        name = this.name,
        price = this.price,
        status = BookStatus.ACTIVATED,
        customer = customer
    )
}