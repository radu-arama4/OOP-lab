package com.radu.oop_lab.lab2;

import java.util.*;

public class Queue {
    List<Integer> queue;
    int MAX_SIZE;

    public Queue(int MAX_SIZE){
        queue = new LinkedList<>();
        this.MAX_SIZE = MAX_SIZE;
    }

    public Queue(){
        queue = new LinkedList<>();
        MAX_SIZE = Integer.MAX_VALUE-100;
    }

    public boolean isEmpty(){
        if(queue.size()==0){
            System.out.println("The queue is empty!");
            return true;
        }else{
            System.out.println("The queue is not empty");
            return false;
        }
    }

    public boolean isFull(){
        if(queue.size()==MAX_SIZE){
            System.out.println("The queue is full!");
            return true;
        }else{
            System.out.println("The queue is not full!\nCurrent nr. of elements - " + queue.size());
            return false;
        }
    }

    public void push(int element){
        if(queue.size()+1>MAX_SIZE){
            System.out.println("MAX_SIZE reached!");
        }else {
            System.out.println("Element - " + element + " added!");
            queue.add(element);
        }
    }

    public int pop(){
        if(queue.size()==0){
            System.out.println("The queue is empty!");
            return -1;
        }else{
            System.out.println("The element - " + queue.get(0) + " was removed!");
            return queue.remove(0);
        }
    }
}
