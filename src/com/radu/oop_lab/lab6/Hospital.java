package com.radu.oop_lab.lab6;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private String phone;

    //The hospital has more departments
    private List<Department> departments = new ArrayList<>();

    public Hospital(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

}
