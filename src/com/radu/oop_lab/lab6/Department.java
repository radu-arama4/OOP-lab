package com.radu.oop_lab.lab6;

import com.radu.oop_lab.lab6.Persons.Staff;
import com.radu.oop_lab.lab6.Resource.ConsoleColor;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    //Each department has more staffs
    private List<Staff> Staffs = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addStaff(Staff staff){
        Staffs.add(staff);
    }

    public void showStaff(){
        System.out.println(ConsoleColor.BLUE + "The staff of the department " + this.name);
        for(Staff staff:Staffs){
            System.out.println(ConsoleColor.CYAN + staff.getName());
        }
    }

}
