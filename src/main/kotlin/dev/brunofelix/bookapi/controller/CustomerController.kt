package dev.brunofelix.bookapi.controller

import dev.brunofelix.bookapi.controller.request.PostCustomerRequest
import dev.brunofelix.bookapi.controller.request.PutCustomerRequest
import dev.brunofelix.bookapi.domain.entity.Customer
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customers")
class CustomerController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun get(@RequestParam name: String?): List<Customer> {
        // TODO: Add service
        return emptyList()
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getById(@PathVariable id: Long): Customer {
        // TODO: Add service
        return Customer(0L, "", "")
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest) {
        // TODO: Add service
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Long, @RequestBody customer: PutCustomerRequest) {
        // TODO: Add service
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) {
        // TODO: Add service
    }
}