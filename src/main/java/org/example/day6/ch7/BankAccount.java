package org.example.day6.ch7;

public class BankAccount {

    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("balance: %d\n", balance);
    }
}
