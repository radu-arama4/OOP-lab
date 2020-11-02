package com.radu.oop_lab.lab6.Staffs;

import com.radu.oop_lab.lab6.Persons.Patient;
import com.radu.oop_lab.lab6.Persons.Staff;
import com.radu.oop_lab.lab6.Resource.ConsoleColor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class OperationsStaff extends Staff {

    //Every operation staff has it's patients
    public List<Patient> patients = new ArrayList<>();

    public OperationsStaff(String title, String givenName, String middleName, String familyName, Date birthDate,
                           String gender, String homeAddress, String phone, String joined, String education, String certification, String languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void showPatients(){
        System.out.println(ConsoleColor.PURPLE + "Patients of " + this.getName());
        for(Patient patient:patients){
            System.out.println(ConsoleColor.YELLOW + patient.getName());
        }
    }

}
