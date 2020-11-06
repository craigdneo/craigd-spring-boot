package com.example.springboot.model;

public class Book {

    private String author;
    private String title;

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
