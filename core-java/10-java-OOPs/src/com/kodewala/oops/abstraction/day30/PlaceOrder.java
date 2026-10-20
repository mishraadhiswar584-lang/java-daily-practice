package com.kodewala.oops.abstraction.day30;

public class PlaceOrder {

    // Public method: the only entry point for placing an order.
    // The internal steps are abstracted away from the caller.
    public boolean placeOrder(String orderName, int orderValue,
                              String customerName, String deliveryAddress) {
        connectToDB(orderName);
        calculateFinalAmount(orderValue);
        deliveryAvailable(deliveryAddress);
        orderConfirmation();
        notifyUser(customerName);
        return true;
    }

    // ---- Core functionalities (private, so they can't be called directly) ----

    // Checks whether the product is available
    private void connectToDB(String orderName) {
        System.out.println("PlaceOrder.connectToDB");
    }

    // Adds charges (e.g. delivery fee of 400) to the order value
    private void calculateFinalAmount(int amount) {
        int finalAmount = amount + 400;
        System.out.println("PlaceOrder.calculateFinalAmount " + finalAmount);
    }

    // Checks whether delivery is available at the given address
    private boolean deliveryAvailable(String address) {
        System.out.println("PlaceOrder.deliveryAvailable " + address);
        return true;
    }

    // Confirms the order
    private boolean orderConfirmation() {
        System.out.println("PlaceOrder.orderConfirmation");
        return true;
    }

    // Notifies the customer
    private void notifyUser(String name) {
        System.out.println("PlaceOrder.notifyUser " + name);
    }
}