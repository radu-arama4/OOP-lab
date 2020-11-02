package com.radu.oop_lab.lab6.Persons;

import com.radu.oop_lab.lab6.Person;

import java.util.Date;

public abstract class Staff extends Person {
    private String joined;
    private String education;
    private String certification;
    private String languages;

    public Staff(String title, String givenName, String middleName,
                 String familyName, Date birthDate, String gender,
                 String homeAddress, String phone, String joined, String education,
                 String certification, String languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

}
