package dev.brunofelix.bookapi.repository

import dev.brunofelix.bookapi.domain.model.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : CrudRepository<Customer, Int> {
    fun findByNameContaining(name: String): List<Customer>
}