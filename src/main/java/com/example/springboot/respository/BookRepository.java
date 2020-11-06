package com.example.springboot.respository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository implements IBookRepository {

    @Override
    public String getBook(String bookId)
    {
        return "getting book from book repository id:" + bookId;
    }

    @Override
    public String deleteBook(String bookId)
    {
        return "deleting book from book repository id:" + bookId;
    }
}
