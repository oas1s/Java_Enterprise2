package ru.itis.graphql.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.graphql.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> { }
