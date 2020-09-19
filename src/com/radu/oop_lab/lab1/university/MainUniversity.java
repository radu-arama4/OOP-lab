package com.radu.oop_lab.lab1.university;

// Tasks 2 and 3 for the first laboratory
public class MainUniversity {
    public static void main(String[] args) {
        //Declaring universities
        University utm = new University("UTM", 1969);
        University usm = new University("USM", 1650);
        University asem = new University("ASEM", 1981);

        //Declaring new students
        Student st1 = new Student("Jora", 20, 9.8);
        Student st2 = new Student("Ion", 19, 9.6);
        Student st3 = new Student("Artur", 18, 9.2);
        Student st4 = new Student("Andy", 21, 7.7);
        Student st5 = new Student("Radu", 24, 6.9);
        Student st6 = new Student("Polina", 23, 4.20);

        //Adding students to the specified universities
        utm.addStudent(st1);
        utm.addStudent(st2);
        usm.addStudent(st3);
        usm.addStudent(st4);
        asem.addStudent(st5);
        asem.addStudent(st6);

        //Printing the average per university
        System.out.println("UTM average - " + utm.calculateAverage());
        System.out.println("USM average - " + usm.calculateAverage());
        System.out.println("ASEM average - " + asem.calculateAverage());
    }
}
