package dev.brunofelix.bookapi.repository

import dev.brunofelix.bookapi.domain.entity.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByNameContaining(name: String): List<Customer>
}