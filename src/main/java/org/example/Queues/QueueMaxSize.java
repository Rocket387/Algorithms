package org.example.Queues;

public class QueueMaxSize {

    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public QueueMaxSize() {
        this(DEFAULT_MAX_SIZE);
    }

    public QueueMaxSize(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void enqueue(String data) {
        this.queue.addToTail(data);
        this.size ++;
        System.out.println("Added " + data + "! Queue size is now " + this.size);
    }

    public static void main(String[] args) {
        QueueMaxSize queue1 = new QueueMaxSize(10);
        System.out.println("This queue can have " + queue1.maxSize + " nodes");

        QueueMaxSize queue2 = new QueueMaxSize();
        System.out.println("This queue can have " + queue2.maxSize + " nodes");

        QueueMaxSize coffeeOrder = new QueueMaxSize();
        System.out.println("coffeeOrder queue has " + coffeeOrder.size + " orders.");
        coffeeOrder.enqueue("latte");
        coffeeOrder.enqueue("espresso");
        coffeeOrder.enqueue("cappuccino");
    }
}
