package com.kodewala.oops.abstraction.day30;

public class PlaceOrder {
//    abstract
    public boolean placeOrder(String orderName, int orderValue, String customerName, String deliveryAddress) {
        connectToDB(orderName);
        calculateFinalAmount(orderValue);
        deliveryAvailable(deliveryAddress);
        orderConfirmation();
        notifyUser(customerName);
        return true;
    }

//    the followings are the core functionalities
    private void connectToDB(String orderName) {
//        checks whether the product is available or not (logic)
        System.out.println("PlaceOrder.connectToDB");
    }

    private void calculateFinalAmount(int amount) {
        int finalAmount = amount + 400;
        System.out.println("PlaceOrder.calculateFinalAmount " + finalAmount);
    }

    private boolean deliveryAvailable(String address) {
//        check whether delivery avalable in this address or not
        System.out.println("PlaceOrder.deliveryAvailable" + address);
        return true;
    }

    private boolean orderConfirmation() {
        System.out.println("PlaceOrder.orderConfirmation");
        return true;
    }

    private void notifyUser(String name) {
        System.out.println("PlaceOrder.notifyUser " + name);
    }

}
