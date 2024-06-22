package dev.brunofelix.bookapi.controller

import dev.brunofelix.bookapi.controller.request.PostBookRequest
import dev.brunofelix.bookapi.service.BookService
import dev.brunofelix.bookapi.service.CustomerService
import dev.brunofelix.bookapi.util.extension.toBook
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books")
class BookController(
    private val bookService: BookService,
    private val customerService: CustomerService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: PostBookRequest) {
        val customer = customerService.findById(request.customerId)
        bookService.create(request.toBook(customer))
    }
}