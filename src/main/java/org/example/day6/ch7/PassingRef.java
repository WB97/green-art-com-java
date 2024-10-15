package org.example.day6.ch7;

import org.example.day5.ch7.BankAccountPo;

public class PassingRef {

//    BankAccount a = new BankAccount();

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1000);

        check(ba);
    }

    static void check(BankAccount ba) {
//        a.deposit(1000);
        System.out.println ("balance = " + ba.balance);
    }
}
