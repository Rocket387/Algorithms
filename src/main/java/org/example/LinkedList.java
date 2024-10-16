package org.example;

import java.util.Objects;

public class LinkedList {


    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public Node findNodeIteratively(String data) {
        Node currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data == data) {
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }

        return null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String toString() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        return output;
    }

    public Node findNodeRecursively(String data, Node currentNode) {
        if (currentNode == null) {
            return null; //base case return null if end of LL is reached
        } else if(Objects.equals(currentNode.data, data)){
            return currentNode; //base case 2 return current node if data value matches data rgument
        } else {
            return findNodeRecursively(data, currentNode.getNextNode()); //recursive case
        }

    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addToHead("Node 1");
        myList.addToTail("Node 2");
        myList.addToTail("Node 3");
        System.out.println(myList.toString());

        Node foundNode = myList.findNodeIteratively("Node 3");
        System.out.println(foundNode.data);

        System.out.println("\n");

        Node foundNode2 = myList.findNodeRecursively("Node 2", myList.head);
        System.out.println(foundNode2.data);


    }
}
