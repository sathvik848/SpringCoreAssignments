package com.cg.core;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "assignments.assignment7")
public class assignment7Config {

    @Bean("bookRecord1")
    public BookRecord getBookRecord(){
        return new BookRecord();
    }
}