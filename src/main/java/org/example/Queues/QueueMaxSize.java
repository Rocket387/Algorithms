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

    //method returns true if the queue has
    //space for another node
    public boolean hasSpace() {
        if (this.size < this.maxSize) {
            return true;
        } else {
            return false;
        }
    }

    //method checks if the queue is empty
    //returns true if empty
    public boolean isEmpty() {
        if (this.size == 0){
            return true;
        }
        return false;
    }

    public void enqueue(String data) {
        this.queue.addToTail(data);
        this.size ++;
        System.out.println("Added " + data + "! Queue size is now " + this.size);
    }

    public String dequeue() {
        if (!this.isEmpty()) {
            String data = this.queue.removeHead();
            this.size--;
            System.out.println("Removed " + data + "! Queue size is now " + this.size);
            return data;
        } else {
            throw new Error("Queue is empty!");
        }
    }

    public String peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.queue.head.data;
        }

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
        coffeeOrder.peek();

        QueueMaxSize smoothieOrders = new QueueMaxSize();
        smoothieOrders.enqueue("strawberry banana");
        smoothieOrders.enqueue("chocolate peanut butter");
        System.out.println("Blending the smoothies...");
        smoothieOrders.dequeue();
        smoothieOrders.dequeue();
        System.out.println("All orders are complete!");

        System.out.println(" ");
        QueueMaxSize queueOne = new QueueMaxSize(25);
        QueueMaxSize queueTwo = new QueueMaxSize(0);
        System.out.println("queueOne has space for more nodes: " + queueOne.hasSpace());
        System.out.println("queueTwo has space for more nodes: " + queueTwo.hasSpace());
        System.out.println("queueOne is empty: " + queueOne.isEmpty());
        System.out.println("queueTwo is empty: " + queueTwo.isEmpty());

        System.out.println("");

        QueueMaxSize boundedQueue = new QueueMaxSize(3);
        boundedQueue.enqueue("one");
        boundedQueue.enqueue("two");
        boundedQueue.enqueue("three");
        boundedQueue.dequeue();
        boundedQueue.dequeue();
        boundedQueue.dequeue();
        boundedQueue.dequeue();

    }
}
