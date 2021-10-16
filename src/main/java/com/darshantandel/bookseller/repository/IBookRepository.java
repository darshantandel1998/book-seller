package com.darshantandel.bookseller.repository;

import com.darshantandel.bookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
