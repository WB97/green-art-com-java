package org.example.day7.ch7;

public class BankAccountUnlID {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.initAccount("12-34-55", "123-1231-123-23", 10000);
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.initAccount("67-89-09", "567-5675-6757-56", 20000);

        bankAccount1.checkMyBalance();
        bankAccount2.checkMyBalance();
    }

    static class BankAccount {
        private String accNumber;
        private String ssNumber;
        private int balance;

        void initAccount(String acc, String ss, int bal) {
            accNumber = acc;
            ssNumber = ss;
            balance = bal;
        }

        void deposit(int amount) {
            balance += amount;
        }

        void withdraw(int amount) {
            balance -= amount;
        }

        void checkMyBalance() {
            System.out.println("========================");
            System.out.println("계좌번호: " + accNumber);
            System.out.println("주민번호: " + ssNumber);
            System.out.println("잔액: " + balance);
            System.out.println("========================");
        }

    }
}


