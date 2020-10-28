package com.radu.oop_lab.lab5;

public class E extends D {
    protected static String e;

    public E(){

    }

    public E(String e){
        this.e = e;
    }

    public E(String a, String b, String c, String d, String e, X x) {
        super(a, b, c, d, x);
        this.e = e;
    }

    @Override
    public void printValue() {
        System.out.println("State of E" + ": " + e);
        //System.out.println(e);
        super.printValue();
    }
}
