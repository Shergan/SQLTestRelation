package com.divashchenko;

import com.divashchenko.dao.StudentDao;
import com.divashchenko.model.Group;
import com.divashchenko.model.Student;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Group java = new Group("Java");

        Student javaStudent1 = new Student("Alex", 20);
        java.getStudents().add(javaStudent1);
        javaStudent1.getGroups().add(java);

        Student javaStudent2 = new Student("Ben", 25);
        java.getStudents().add(javaStudent2);
        javaStudent2.getGroups().add(java);

        //=====================================

        Group cpp = new Group("CPP");

        Student cppStudent1 = new Student("Olga", 19);
        cpp.getStudents().add(cppStudent1);
        cppStudent1.getGroups().add(cpp);

        Student cppStudent2 = new Student("Maria", 21);
        cpp.getStudents().add(cppStudent2);
        cppStudent2.getGroups().add(cpp);

        //=====================================

        Student max = new Student("Max", 38);
        java.getStudents().add(max);
        max.getGroups().add(java);
        cpp.getStudents().add(max);
        max.getGroups().add(cpp);

        System.out.println(java);
        System.out.println(cpp);

        try {
            StudentDao studentDao = new StudentDao();
            System.out.println("Test");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
