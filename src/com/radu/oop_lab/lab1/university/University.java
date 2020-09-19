package com.radu.oop_lab.lab1.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int foundationYear;
    private List<Student> students;

    public University(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public double calculateAverage(){
        double sum = 0;
        int count = 0;
        for(Student st : students){
            sum+=st.getAverage_mark();
            count++;
        }
        return sum/count;
    }
}
