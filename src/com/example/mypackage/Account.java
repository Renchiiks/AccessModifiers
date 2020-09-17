package com.example.mypackage;

import java.util.ArrayList;

public class Account {
    private String accName;
    private int balance;
    private ArrayList<Integer> transactions;

    public Account(String accName) {
        this.accName = accName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        int withdraw = -amount;
        if (withdraw < 0) {
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + " withdraw. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculate() {
        this.balance = 0;
        for (int action : this.transactions) {
            this.balance += action;
        }
        System.out.println("Calculated balance is: " + this.balance);
    }
}
