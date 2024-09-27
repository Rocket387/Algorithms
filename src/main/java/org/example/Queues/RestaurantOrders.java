package org.example.Queues;

public class RestaurantOrders {

    public QueueMaxSize headChef;
    public QueueMaxSize sousChef;
    public QueueMaxSize waitingList;

    public RestaurantOrders() {
        //instantiates queues
        this.headChef = new QueueMaxSize(3);
        this.sousChef = new QueueMaxSize(3);
        this.waitingList = new QueueMaxSize();
    }

    public void assign(String[] orders) {
        for (String order : orders) {
            try {
                this.headChef.enqueue(order);
                System.out.println("Order for " + order + " taken by Head Chef.");
            } catch (Error e) {
                if(sousChef.hasSpace()) {
                    this.sousChef.enqueue(order);
                    System.out.println("Head Chef is busy! Assign " + order + " order to Sous Chef");
                } else {
                    this.waitingList.enqueue(order);
                    System.out.println("Both chefs are busy! Add " + order + " order to the waiting list.");
                }
            }
        }
        System.out.println("--------------");
        System.out.println("You've got only " + this.waitingList.size +" on the waiting list. Keep up the hard work chefs!");
    }

    public static void main(String[] args) {
        String [] orders = {"green curry", "pad thai", "gyoza", "cucumber salad",
                "pad see ew", "brown rice", "red curry", "salad rolls"};

        RestaurantOrders foodOrders = new RestaurantOrders();
        foodOrders.assign(orders);
    }
}
