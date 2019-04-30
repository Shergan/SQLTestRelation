package com.divashchenko.model;

import javafx.beans.binding.StringBinding;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Group> groups = new ArrayList<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < groups.size(); i++) {
            sb.append(groups.get(i).getName()).append(", ");
            if (i == groups.size() - 1) {
                sb.delete(sb.length() - 2, sb.length());
            }
        }

        if (sb.length() < 1) {
            sb.append("[]");
        }

        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groups=" + sb.toString() +
                '}';
    }
}
