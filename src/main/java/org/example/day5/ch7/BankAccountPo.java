package org.example.day5.ch7;

public class BankAccountPo {
    static int balance = 0;

    public static int desposit(int amount) {
        balance += amount;
        return balance;
    }

    public static int withdraw(int amount) {
        balance += amount;
        return balance;
    }

    public static int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }
}
