package com.radu.oop_lab.lab6.Staffs.Operations;

import com.radu.oop_lab.lab6.Staffs.OperationsStaff;

import java.util.Date;

public class Doctor extends OperationsStaff {

    String specialty;
    String locations;

    public Doctor(String title, String givenName, String middleName, String familyName,
                  Date birthDate, String gender, String homeAddress, String phone, String joined,
                  String education, String certification, String languages, String specialty, String locations) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone,
                joined, education, certification, languages);
        this.specialty = specialty;
        this.locations = locations;
    }
}
