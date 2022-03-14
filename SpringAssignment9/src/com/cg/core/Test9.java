package com.cg.core;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test9 {

    public static void main(String[] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        FatherBean fatherBean = context.getBean("fatherBean",FatherBean.class);
        System.out.println(fatherBean.toString());
        context.registerShutdownHook();

    }
}