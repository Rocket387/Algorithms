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

    public void push(String data) {
        this.stack.addToHead(data);
        this.size++;
        System.out.println("Added " + data + "! Stack size is now " + this.size);
    }

    public String pop() {
        String data = this.stack.removeHead();
        this.size--;
        System.out.println("Removed " + data + "! Stack size is now " + this.size);
        return data;
    }

    public String peek() {
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

    }
}
