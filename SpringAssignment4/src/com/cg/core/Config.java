package com.cg.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "assignments.assignment4")
public class Config {

    @Bean(name = "bankController")
    public BankController getBankController(){
        BankController bankController = new BankController();
        return bankController;
    }

}