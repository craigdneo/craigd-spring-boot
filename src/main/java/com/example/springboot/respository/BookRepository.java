package com.example.springboot.respository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public String getBook(String bookId)
    {
        return "book from book repository id:" + bookId;
    }
}
