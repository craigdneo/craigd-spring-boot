package com.example.springboot.controllers;

import com.example.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class BooksController {

    private BookService bookService;

    @Autowired
    public BooksController(BookService bookService){
        this.bookService = bookService;
    }

    @RequestMapping(value = "/books/{id}", method = {RequestMethod.DELETE})
    public String deleteBook(
            @PathVariable(value = "id") final String bookId) {
        return bookService.deleteBook(bookId);
    }

    @RequestMapping(value = "/books/{id}", method = {RequestMethod.GET})
    public String getBook(
            @PathVariable(value = "id") final String bookId) {
       return bookService.getBook(bookId);
    }

    @RequestMapping("/authors/{id}")
    public String getAuthor(
            @PathVariable(value = "id") final String authorId) {
        return "Author Id:" + authorId;
    }
}
