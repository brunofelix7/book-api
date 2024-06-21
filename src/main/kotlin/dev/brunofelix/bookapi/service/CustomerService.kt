package dev.brunofelix.bookapi.service

import dev.brunofelix.bookapi.domain.entity.Customer
import dev.brunofelix.bookapi.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val repository: CustomerRepository
) {
    fun create(customer: Customer) {
        repository.save(customer)
    }

    fun update(customer: Customer) {
        if (!repository.existsById(customer.id!!)) {
            throw Exception()
        }
        repository.save(customer)
    }

    fun delete(id: Int) {
        if (!repository.existsById(id)) {
            throw Exception()
        }
        repository.deleteById(id)
    }

    fun findAll(name: String?): List<Customer> {
        return if (name != null) {
            repository.findByNameContaining(name)
        } else {
            repository.findAll().toList()
        }
    }

    fun findById(id: Int): Customer {
        return repository.findById(id).orElseThrow()
    }
}