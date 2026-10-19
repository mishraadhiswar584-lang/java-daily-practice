package com.kodewala.oops.abstraction.day30;

public class AccountMgmt {
    public static  void main(String[] args) {
        Account account = new Account();
//        required functionalities
        account.openAccount("Sushovan", "BTM layout, Bangaloer", "CJOPJ06914b");
//        when the core functionalities of Account class is public another class can use that, we should hide the core funct.
//        account.validatePan("JHDO6JS2");
//        account.notifyUser();
//        account.createUserID();

//        when I made the core functionalities private then another class can't access them directly
    }
}
