package com.radu.oop_lab.lab5;

public class I extends H {
    protected static String i;

    public I(){

    }

    public I(String i){
        this.i = i;
    }

    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i, X x) {
        super(a, b, c, d, e, f, g, h, x);
        this.i = i;
    }

    @Override
    public void printValue() {
        System.out.println("State of I" + ": " + i);
        //System.out.println(i);
        super.printValue();
    }
}
