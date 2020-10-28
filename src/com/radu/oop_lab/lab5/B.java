package com.radu.oop_lab.lab5;

public class B extends A{
    protected static String b;

    public B(){

    }

    public B(String b){
        this.b=b;
    }

    public B(String a, String b, X x) {
        super(a, x);
        this.b = b;
    }

    @Override
    public void printValue() {
        System.out.println("State of B" + ": " + b);
        super.printValue();
    }

    public void printValue(boolean justB){
        if(justB){
            System.out.println(b);
        }
    }
}
