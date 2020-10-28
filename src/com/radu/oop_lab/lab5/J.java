package com.radu.oop_lab.lab5;

public class J extends I{
    protected static String j;

    public J(String j){
        this.j = j;
    }

    public J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, X x) {
        super(a, b, c, d, e, f, g, h, i, x);
        this.j = j;
    }

    @Override
    public void printValue() {
        System.out.println("State of J" + ": " + j);
        //System.out.println(j);
        super.printValue();
    }
}
