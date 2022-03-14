package com.cg.core;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
            Student student = applicationContext.getBean("student1",Student.class);
            System.out.println();
            System.out.println("Student Details :");
            System.out.println("RollNo: "+student.getStudentRollNumber());
            System.out.println("Name: "+student.getStudentName());
            System.out.println("Subject: "+student.getSubject().toString());
            System.out.println("Teacher: "+student.getTeacher().toString());

        }
        catch (Exception e) {
            System.out.println("Exception in Test5.java");
            e.printStackTrace();
        }
    }

}