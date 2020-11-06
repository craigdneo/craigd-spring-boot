package com.example.springboot.config;

import com.example.springboot.respository.BookRepository;
import com.example.springboot.respository.IBookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public IBookRepository getBookRepository(){
        return new BookRepository();
    }
}
