package dev.brunofelix.bookapi.controller

import dev.brunofelix.bookapi.controller.request.PostBookRequest
import dev.brunofelix.bookapi.controller.request.PutBookRequest
import dev.brunofelix.bookapi.controller.request.PutCustomerRequest
import dev.brunofelix.bookapi.domain.entity.Book
import dev.brunofelix.bookapi.service.BookService
import dev.brunofelix.bookapi.service.CustomerService
import dev.brunofelix.bookapi.util.extension.toBook
import dev.brunofelix.bookapi.util.extension.toCustomer
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

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody request: PutBookRequest) {
        val bookSaved = bookService.findById(id)
        bookService.update(request.toBook(bookSaved))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        bookService.delete(id)
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getById(@PathVariable id: Int) = bookService.findById(id)

    @GetMapping("/actives")
    @ResponseStatus(HttpStatus.OK)
    fun getActives() = bookService.findActives()

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll() = bookService.findAll()
}