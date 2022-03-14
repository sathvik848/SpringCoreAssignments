package com.cg.core;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {

    private Integer studentRollNumber;
    private String studentName;

    @Inject
    @Qualifier("subject1")
    private Subject subject;

    @Resource(name="teacher1")
    private Teacher teacher;

    public Integer getStudentRollNumber() {
        return studentRollNumber;
    }

    @Value("11704058")
    public void setStudentRollNumber(Integer studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    @Value("Sathvik Krishna")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}