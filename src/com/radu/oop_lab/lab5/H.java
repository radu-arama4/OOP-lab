package com.radu.oop_lab.lab5;

public class H extends G{
    protected static String h;

    private X x = new X("xxh");

    public H(){

    }

    public H(String h){
        this.h = h;
    }

    public H(String a, String b, String c, String d, String e, String f, String g, String h, X x) {
        super(a, b, c, d, e, f, g, x);
        this.h = h;
    }

    @Override
    public void printValue() {
        System.out.println("State of H" + ": " + h + ", x - " + this.x.getX());
//        System.out.println(h);
//        System.out.println(this.x.getX());
        super.printValue();
    }
}
