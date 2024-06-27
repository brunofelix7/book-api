package dev.brunofelix.bookapi.repository

import dev.brunofelix.bookapi.domain.entity.Book
import dev.brunofelix.bookapi.domain.enums.BookStatus
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : CrudRepository<Book, Int> {
    fun findByStatus(status: BookStatus): List<Book>
}