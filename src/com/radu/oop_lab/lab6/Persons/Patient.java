package com.radu.oop_lab.lab6.Persons;

import com.radu.oop_lab.lab6.Person;

import java.util.Date;

public class Patient extends Person {
    private String id;
    private int age;
    private String accepted;
    private String sickness;
    private String prescriptions;
    private String allergies;
    private String specialReqs;

    public Patient(String title, String givenName, String middleName,
                   String familyName, Date birthDate, String gender,
                   String homeAddress, String phone, String id,
                   int age, String accepted, String sickness,
                   String prescriptions, String allergies, String specialReqs) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone);
        this.id = id;
        this.age = age;
        this.accepted = accepted;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }

}
