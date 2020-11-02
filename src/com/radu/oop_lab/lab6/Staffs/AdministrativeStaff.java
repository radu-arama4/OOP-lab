package com.radu.oop_lab.lab6.Staffs;

import com.radu.oop_lab.lab6.Persons.Staff;

import java.util.Date;

public abstract class AdministrativeStaff extends Staff {
    public AdministrativeStaff(String title, String givenName, String middleName, String familyName, Date birthDate, String gender, String homeAddress, String phone, String joined, String education, String certification, String languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
    }
}
