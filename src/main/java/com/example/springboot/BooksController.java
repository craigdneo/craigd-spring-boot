package com.example.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BooksController {

    @RequestMapping("/books/{id}")
    public String getBook(
            @PathVariable(value = "id") final String bookId) {
        return "Book Id:" + bookId;
    }

    @RequestMapping("/authors/{id}")
    public String getAuthor(
            @PathVariable(value = "id") final String authorId) {
        return "Author Id:" + authorId;
    }
}
