package com.raj.DataBaseMySql.repository;

import com.raj.DataBaseMySql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByIsbn(String isbn);
    Optional<Book> findById(long id);
}
