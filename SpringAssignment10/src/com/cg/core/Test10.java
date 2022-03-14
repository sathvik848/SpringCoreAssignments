package com.cg.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10  {

    public static void main(String[] args){
        new ApplicationContextImpl().setApplicationContext(new ClassPathXmlApplicationContext("Beans.xml"));
    }
}