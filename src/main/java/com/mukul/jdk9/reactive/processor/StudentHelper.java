package com.mukul.jdk9.reactive.processor;

import java.util.ArrayList;
import java.util.List;

public class StudentHelper {
    public static List<Student> getStudents() {

        Student student1 = new Student(1,"Jaya");
        Student student2 = new Student(2,"Rahul");
        Student student3 = new Student(3,"Megha");
        Student student4 = new Student(4,"Tapas");
        Student student5 = new Student(5,"Raghav");
        List<Student> studentList = new ArrayList<> ();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        return studentList;
    }
}
