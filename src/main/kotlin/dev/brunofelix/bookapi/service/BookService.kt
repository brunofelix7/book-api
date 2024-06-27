package dev.brunofelix.bookapi.service

import dev.brunofelix.bookapi.domain.entity.Book
import dev.brunofelix.bookapi.domain.entity.Customer
import dev.brunofelix.bookapi.domain.enums.BookStatus
import dev.brunofelix.bookapi.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    private val repository: BookRepository
) {
    fun create(book: Book) {
        repository.save(book)
    }

    fun update(book: Book) {
        repository.save(book)
    }

    fun delete(id: Int) {
        val book = findById(id)
        book.status = BookStatus.CANCELED
        update(book)
    }

    fun findAll() = repository.findAll().toList()

    fun findActives() = repository.findByStatus(BookStatus.ACTIVATED)

    fun findById(id: Int): Book = repository.findById(id).orElseThrow()
}