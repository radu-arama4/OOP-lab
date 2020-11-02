package com.radu.oop_lab.lab6.Staffs.Administrative;

import java.util.Date;

public class Receptionist extends FrontDeskStaff {
    public Receptionist(String title, String givenName, String middleName, String familyName, Date birthDate, String gender,
                        String homeAddress, String phone, String joined, String education, String certification, String languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
    }
}
