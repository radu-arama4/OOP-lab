package com.radu.oop_lab.lab6;

import com.radu.oop_lab.lab6.Resource.ConsoleColor;

import java.util.Date;

public abstract class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private String name;
    private Date birthDate;
    private String gender;
    private String homeAddress;
    private String phone;

    public Person(String title, String givenName, String middleName,
                  String familyName, Date birthDate, String gender,
                  String homeAddress, String phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = givenName + " " + middleName + " " + familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ConsoleColor.GREEN_BOLD + "Person{" +
                "title='" + title + '\'' +
                ", givenName='" + givenName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

