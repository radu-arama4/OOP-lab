package com.radu.oop_lab.lab6;

import com.radu.oop_lab.lab6.Persons.Patient;
import com.radu.oop_lab.lab6.Staffs.Administrative.Receptionist;
import com.radu.oop_lab.lab6.Staffs.AdministrativeStaff;
import com.radu.oop_lab.lab6.Staffs.Operations.Doctor;
import com.radu.oop_lab.lab6.Staffs.Operations.Nurse;
import com.radu.oop_lab.lab6.Staffs.OperationsStaff;
import com.radu.oop_lab.lab6.Staffs.Technical.Technologist;
import com.radu.oop_lab.lab6.Staffs.TechnicalStaff;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Creating a new hospital
        Hospital hospital = new Hospital("Spitalul nr. 1", "str. Bucuresti", "022432432");

        //Creating 2 new departments
        Department department1 = new Department("Department nr. 1");
        Department department2 = new Department("Department nr. 2");

        //Adding the departments to the hospital
        hospital.addDepartment(department1);
        hospital.addDepartment(department2);

        //Creating new Staff objects
        OperationsStaff nurse = new Nurse("First",
                "Ion",
                "Jora",
                "Anton",
                new Date(1992, Calendar.APRIL, 02, 4, 36, 21),
                "female", "31 august 3/5", "12434234", "31.04.1233",
                "UFM", "certificate", "English"
        );

        OperationsStaff doctor = new Doctor("Second",
                "Ion",
                "Jorik",
                "Antoshka",
                new Date(1992, Calendar.APRIL, 02, 4, 36, 21),
                "male", "31 august 3/5", "12434234", "31.04.1233",
                "UFM","certificate", "English", "Orthopedy", "location"
        );

        AdministrativeStaff receptionist = new Receptionist("Third",
                "Ion",
                "Jorik",
                "Antoshka",
                new Date(1992, Calendar.APRIL, 02, 4, 36, 21),
                "male", "31 august 3/5", "12434234", "31.04.1233",
                "UTM","certificate", "English");

        TechnicalStaff technologist = new Technologist("Fourth",
                "Boris",
                "Blabla",
                "Mihai",
                new Date(1992, Calendar.APRIL, 02, 4, 36, 21),
                "male", "31 august 3/5", "12434234", "31.04.1233",
                "UTM","certificate", "English");


        //Adding these staffs to the departments 1 and 2
        department1.addStaff(nurse);
        department1.addStaff(doctor);

        department2.addStaff(receptionist);
        department2.addStaff(technologist);

        //Creating new patients
        Patient patient1 = new Patient("Fifth",
                "Leoha",
                "Blabla",
                "Jora",
                new Date(1992, Calendar.APRIL, 02, 4, 36, 21),
                "male", "31 august 3/5", "12434234", "1231", 21, "31.04.1233",
                "Scoliosis", "Paracetamol", "Fructe de padure", "Maladet");

        Patient patient2 = new Patient("Sixth",
                "Mikea",
                "JDsad",
                "Mihai",
                new Date(1992, Calendar.APRIL, 02, 4, 36, 21),
                "male", "31 august 3/5", "12434234", "1231", 21, "31.04.1233",
                "Handicap", "Paracetamol", "Mandarine", "Schiopateaza");

        //Adding the patients to a nurse and a doctor
        nurse.addPatient(patient1);
        doctor.addPatient(patient2);
        doctor.addPatient(patient1);

        //Printing the patients of Operations Staffs
        nurse.showPatients();
        doctor.showPatients();

        //Printing the staff for each department
        System.out.println("\n");
        department1.showStaff();
        department2.showStaff();

        //Printing info about each one
        System.out.println("\n"+nurse.toString());
        System.out.println(doctor.toString());
        System.out.println(technologist.toString());

        System.out.println(patient1.toString());
        System.out.println(patient2.toString());

    }
}
