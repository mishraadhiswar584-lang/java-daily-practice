package com.kodewala.oops.abstraction.day30;

public class OrderMgmt {
    public static void main(String[] args) {
        PlaceOrder placeOrder = new PlaceOrder();
        boolean result = placeOrder.placeOrder("Laptop Lenovo LEGION", 67000, "adhiswar Jana", "BTM Layout, Bangalore");
        System.out.println("result = " + result);
    }
}
