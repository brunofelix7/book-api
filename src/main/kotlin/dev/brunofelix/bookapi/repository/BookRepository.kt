package dev.brunofelix.bookapi.repository

import dev.brunofelix.bookapi.domain.entity.Book
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : CrudRepository<Book, Int>