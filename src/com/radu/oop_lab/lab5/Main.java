package com.radu.oop_lab.lab5;

public class Main {
    public static void main(String[] args) {

        //Declaring instances of classes A, B, C
        A a = new A("aa", new X("x"));
        B b = new B("b");
        C c = new C("c");

        //printing each state
        a.printValue();
        b.printValue(true);
        c.printValue(true);

        System.out.println("=============");

        //printing each state of C, B, A using just C
        c.printValue();

        System.out.println("=============");

        // X for A is declared from the constructor. X for D and H are declared in the scope of the class.
        J j = new J("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", new X("x"));
        //Printing the state of all classes using just the instance of J class
        j.printValue();
    }
}
