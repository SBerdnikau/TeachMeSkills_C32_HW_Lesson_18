package com.teachmeskills.lesson_18.task2;

public class Student implements Comparable<Student>{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

    @Override
    public String toString() {
        return "Name student: " + name ;
    }
}
