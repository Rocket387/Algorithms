package org.example.Queues;

import org.example.LinkedList;

public class Queue {

    public LinkedList queue;
    public int size;

    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
    }

    public static void main(String[] args) {

        Queue firstQueue = new Queue();
        System.out.println("This queue has " + firstQueue.size + " nodes");
    }
}
