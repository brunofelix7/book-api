package dev.brunofelix.bookapi.controller

import dev.brunofelix.bookapi.controller.request.PostCustomerRequest
import dev.brunofelix.bookapi.controller.request.PutCustomerRequest
import dev.brunofelix.bookapi.domain.entity.Customer
import dev.brunofelix.bookapi.service.CustomerService
import dev.brunofelix.bookapi.util.extension.toCustomer
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customers")
class CustomerController(
    private val service: CustomerService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: PostCustomerRequest) {
        service.create(request.toCustomer())
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody request: PutCustomerRequest) {
        service.update(request.toCustomer(id))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        service.delete(id)
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun get(@RequestParam name: String?): List<Customer> {
        return service.findAll(name)
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getById(@PathVariable id: Int): Customer {
        return service.findById(id)
    }
}