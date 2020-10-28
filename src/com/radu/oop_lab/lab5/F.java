package com.radu.oop_lab.lab5;

public class F extends E {
    protected static String f;

    public F(){

    }

    public F(String f){
        this.f = f;
    }

    public F(String a, String b, String c, String d, String e, String f, X x) {
        super(a, b, c, d, e, x);
        this.f = f;
    }

    @Override
    public void printValue() {
        System.out.println("State of F" + ": " + f);
        //System.out.println(f);
        super.printValue();
    }
}
