package com.kodewala.oops.abstraction.day30;
 
public class Account {

    // Public method: the only thing other classes need to know about.
    // It hides the steps involved in opening an account.
    public boolean openAccount(String name, String address, String pan) {
        connectWithDB();
        validateNameAndAddress(name, address);
        validatePan(pan);
        createUserID();
        notifyUser();
        return true;
    }

    // ---- Core functionalities (hidden from other classes) ----

    // Checks that the name and address are valid
    private boolean validateNameAndAddress(String name, String address) {
        System.out.println("validate name and address");
        return true;
    }

    // Checks that the PAN is valid
    private boolean validatePan(String pan) {
        System.out.println("validating pan");
        return true;
    }

    // Opens the database connection
    private void connectWithDB() {
        System.out.println("connected with DB");
    }

    // Generates a unique user ID for the new account
    private String createUserID() {
        System.out.println("Creating user ID");
        return "some user id";
    }

    // Sends a notification to the user
    private void notifyUser() {
        System.out.println("notify user");
    }
}