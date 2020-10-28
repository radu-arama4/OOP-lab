package com.radu.oop_lab.lab5;

public class G extends F {
    protected static String g;

    public G(){

    }

    public G(String g){
        this.g = g;
    }

    public G(String a, String b, String c, String d, String e, String f, String g, X x) {
        super(a, b, c, d, e, f, x);
        this.g = g;
    }

    @Override
    public void printValue() {
        System.out.println("State of G" + ": " + g);
        //System.out.println(g);
        super.printValue();
    }
}
