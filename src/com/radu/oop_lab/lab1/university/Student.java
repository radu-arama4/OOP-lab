package com.radu.oop_lab.lab1.university;

public class Student {
    private String name;
    private int age;
    private double average_mark;

    public Student(String name, int age, double average_mark) {
        this.name = name;
        this.age = age;
        this.average_mark = average_mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverage_mark() {
        return average_mark;
    }
}
