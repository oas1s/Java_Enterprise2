package ru.itis.graphql.service;

import org.springframework.stereotype.Service;
import ru.itis.graphql.model.Book;
import ru.itis.graphql.repo.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book findBookById(Long id){
        return repo.findById(id).get();
    }

    public Book addBook(String title, String author) {
        return repo.save(new Book(title, author));
    }
}

