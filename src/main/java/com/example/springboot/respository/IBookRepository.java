package com.example.springboot.respository;

public interface IBookRepository {

    public String getBook(String bookId);
    public String deleteBook(String bookId);

}
