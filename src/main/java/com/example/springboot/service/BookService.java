package com.example.springboot.service;

import com.example.springboot.respository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private IBookRepository bookRepository;

    @Autowired
    public BookService(IBookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public String getBook(String bookId){
        return bookRepository.getBook(bookId);
    }

    public String deleteBook(String bookId){ return bookRepository.deleteBook(bookId); }

}
