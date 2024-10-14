package org.example.day5.ch6;

public class ReculFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
