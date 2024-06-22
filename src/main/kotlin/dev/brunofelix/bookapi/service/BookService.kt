package dev.brunofelix.bookapi.service

import dev.brunofelix.bookapi.domain.entity.Book
import dev.brunofelix.bookapi.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    private val repository: BookRepository
) {
    fun create(book: Book) {
        repository.save(book)
    }
}