package com.radu.oop_lab.lab1.monitor;

public class Monitor {

    private String color;
    private int dimension;
    private int resolution;

    public Monitor(String color, int dimension, int resolution) {
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void compareByDimension(Monitor m2){
        if(this.getDimension()>m2.getDimension()){
            System.out.println("The " + this.getColor() + " monitor has a bigger dimension.");
        }else {
            System.out.println("The " + m2.getColor() + " monitor has a bigger dimension.");
        }
    }

    public void compareByResolution(Monitor m2){
        if(this.getResolution()>m2.getResolution()){
            System.out.println("The " + this.getColor() + " monitor has a bigger resolution.");
        }else {
            System.out.println("The " + m2.getColor() + " monitor has a bigger resolution.");
        }
    }

}
