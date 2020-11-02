package com.radu.oop_lab.lab6.Staffs.Technical;

import com.radu.oop_lab.lab6.Staffs.TechnicalStaff;

import java.util.Date;

public class Technologist extends TechnicalStaff {
    public Technologist(String title, String givenName, String middleName, String familyName, Date birthDate,
                        String gender, String homeAddress, String phone, String joined, String education,
                        String certification, String languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined,
                education, certification, languages);
    }
}
