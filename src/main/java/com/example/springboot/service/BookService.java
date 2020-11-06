package com.example.springboot.service;

import com.example.springboot.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public String getBookFromRepository(String bookId){
        return bookRepository.getBook(bookId);
    }

}
