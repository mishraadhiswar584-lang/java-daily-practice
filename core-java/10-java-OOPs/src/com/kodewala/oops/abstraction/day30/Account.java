package com.kodewala.oops.abstraction.day30;

public class Account {
// abstract
   public boolean openAccount(String name, String address, String pan) {
       connectWtihDB();
       validateNameAndAddress(name, address);
       validatePan(pan);
       createUserID();
       notifyUser();
       return true;
   }
// core functionalities
   private boolean validateNameAndAddress(String name, String address) {
       System.out.println("validate name and address");
       return true;
   }

   public boolean validatePan(String pan) {
       System.out.println("validating pan");
       return true;
   }

    private void connectWtihDB() {
       System.out.println("connected with DB");
   }

    private String createUserID() {
       System.out.println("Creating user ID");
       return "some user id";
   }

    private void notifyUser() {
       System.out.println("notify user");
   }
}

