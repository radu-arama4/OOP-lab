package com.radu.oop_lab.lab5;

public class C extends B {
    protected static String c;

    public C(){

    }

    public C(String c){
        this.c = c;
    }

    public C(String a, String b, String c, X x) {
        super(a, b, x);
        this.c = c;
    }

    @Override
    public void printValue() {
        System.out.println("State of C" + ": " + c);
        //System.out.println(c);
        super.printValue();
    }

    public void printValue(boolean justC){
        if(justC){
            System.out.println("State of C: " + c);
        }
    }
}
