package com.radu.oop_lab.lab2;

public class MainBox {
    public static void main(String[] args) {

        //First task
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(1,4,5);

        System.out.println("Box 1 : " + box1.getDepth() + " " + box1.getHeight() + " " + box1.getWidth());
        System.out.println("Box 2 : " + box2.getDepth() + " " + box2.getHeight() + " " + box2.getWidth());
        System.out.println("Box 3 : " + box3.getDepth() + " " + box3.getHeight() + " " + box3.getWidth());

        //Third task for BOX
        box3.computeArea();
        box3.computeVolume();

    }
}
