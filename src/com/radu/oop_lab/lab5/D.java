package com.radu.oop_lab.lab5;

public class D extends C {
    protected static String d;

    protected X x = new X("xxd");

    public D(){

    }

    public D(String d){
        this.d = d;
    }

    public D(String a, String b, String c, String d, X x) {
        super(a, b, c, x);
        this.d = d;
    }

    @Override
    public void printValue() {
        System.out.println("State of D" + ": " + d + ", x - " + this.x.getX());
//        System.out.println(d);
//        System.out.println(this.x.getX());
        super.printValue();
    }
}
