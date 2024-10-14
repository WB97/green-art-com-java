package org.example.day5.ch7;

public class BankAccountPoTest {
    public static void main(String[] args) {
        System.out.println(BankAccountPo.balance);
        BankAccountPo.desposit(4000);
        System.out.println(BankAccountPo.balance);

        BankAccountPo.withdraw(2000);
        System.out.println(BankAccountPo.balance);
        BankAccountPo.checkMyBalance();
    }
}
