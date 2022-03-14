package com.cg.core;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test1 {
public static void main(String[] args) {
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
Customer customer1 = applicationContext.getBean("customer1", Customer.class);
Customer customer2 = applicationContext.getBean("customer2", Customer.class);



customer1.displayCustomerInfo();
customer2.displayCustomerInfo();
}
}