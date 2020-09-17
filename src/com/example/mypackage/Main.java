package com.example.mypackage;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("Ren");
        account.deposit(1000);
        account.withdraw(500);
        account.deposit(-333);
        account.withdraw(-4);
        account.calculate();
        //account.balance = 23333;

        System.out.println("Balance on account is " + account.getBalance());
        account.calculate();
    }
}
