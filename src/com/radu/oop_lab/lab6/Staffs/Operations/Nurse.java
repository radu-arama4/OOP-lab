package com.radu.oop_lab.lab6.Staffs.Operations;

import com.radu.oop_lab.lab6.Staffs.OperationsStaff;

import java.util.Date;

public class Nurse extends OperationsStaff {
    public Nurse(String title, String givenName, String middleName, String familyName, Date birthDate, String gender,
                 String homeAddress, String phone, String joined, String education, String certification,
                 String languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education,
                certification, languages);
    }
}
