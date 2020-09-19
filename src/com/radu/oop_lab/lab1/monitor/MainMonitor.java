package com.radu.oop_lab.lab1.monitor;

//Task 1 for the first laboratory
public class MainMonitor {

    public static void main(String[] args) {
        //Declaring new monitors
        Monitor monitor1 = new Monitor("red", 16, 1080);
        Monitor monitor2 = new Monitor("yellow", 17, 480);

        //Implementing the methods compareByDimension and compareByResolution
        monitor1.compareByDimension(monitor2);
        monitor1.compareByResolution(monitor2);
    }
}
