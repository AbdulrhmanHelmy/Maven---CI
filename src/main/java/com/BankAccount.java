package com;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
