package ru.itis.graphql.controller;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ru.itis.graphql.model.Book;
import ru.itis.graphql.service.BookService;

import java.util.List;

@Controller
public class BookGraphQLController {

    private final BookService service;

    public BookGraphQLController(BookService service) {
        this.service = service;
    }

    @QueryMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @QueryMapping
    public Book getBookById(@Argument Long id) {
        return service.findBookById(id);
    }

    @MutationMapping
    public Book addBook(@Argument String title, @Argument String author) {
        return service.addBook(title, author);
    }
}
