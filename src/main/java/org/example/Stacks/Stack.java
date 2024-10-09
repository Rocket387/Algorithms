package org.example.Stacks;

import org.example.LinkedList;

public class Stack {

    public LinkedList stack;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace() {
        if(this.size < this.maxSize) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(this.size == 0) {
            return true;
        }
        return false;
    }

    public void push(String data) {
        if(this.hasSpace()) {
            this.stack.addToHead(data);
            this.size++;
            System.out.println("Added " + data + "! Stack size is now " + this.size);
        }
    }

    public String pop() {
        if(!this.isEmpty()) {
            String data = this.stack.removeHead();
            this.size--;
            System.out.println("Removed " + data + "! Stack size is now " + this.size);
            return data;
        } else {
            throw new Error("Stack is empty!");
        }
    }

    public String peek() {

        if (this.stack.head == null) {
            return null; // or throw an exception depending on the requirement
        }
        System.out.println("Head data: " + this.stack.head.data);
        return this.stack.head.data;

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("This stack has " + stack.size + " nodes");

        Stack stackOne = new Stack(6);
        System.out.println("stackOne can have " + stackOne.maxSize + " nodes!");

        Stack stackTwo = new Stack();
        System.out.println("StackTwo can have " + stackTwo.maxSize + " nodes");

        Stack fruitBowl = new Stack();
        fruitBowl.push("Apples");
        fruitBowl.push("Bananas");
        fruitBowl.push("Pears");

        Stack Jewellery = new Stack();
        Jewellery.push("Gold");
        Jewellery.push("Silver");
        Jewellery.push("Bronze");

        Jewellery.pop();
        Jewellery.pop();

        Jewellery.peek();

        System.out.println("");

        Stack carsInDriveway = new Stack();
        carsInDriveway.push("Van");
        carsInDriveway.push("Convertible");
        carsInDriveway.peek();

        carsInDriveway.pop();
        carsInDriveway.pop();

        carsInDriveway.peek();

    }
}
