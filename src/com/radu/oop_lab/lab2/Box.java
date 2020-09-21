package com.radu.oop_lab.lab2;

public class Box {
    private double height;
    private double width;
    private double depth;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(double value) {
        this.height = value;
        this.width = value;
        this.depth = value;
    }

    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double computeArea(){
        double result = height*width;
        System.out.println("Area - " + result);
        return result;
    }

    public double computeVolume(){
        double result = height*width*depth;
        System.out.println("Volume - " + result);
        return result;
    }
}
