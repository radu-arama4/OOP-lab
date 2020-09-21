package com.radu.oop_lab.lab2;

public class MainQueue {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(6);

        //Second task for QUEUE
        System.out.println("First queue!");
        queue1.push(2);
        queue1.push(5);
        queue1.push(3);

        queue1.pop();

        System.out.println("Second queue!");
        queue2.push(4);
        queue2.push(5);
        queue2.push(7);

        queue2.pop();

        //Third task for QUEUE
        System.out.println("First queue: ");
        queue1.isEmpty();
        queue1.isFull();

        System.out.println("Second queue: ");
        queue2.isEmpty();
        queue2.isFull();

    }
}
