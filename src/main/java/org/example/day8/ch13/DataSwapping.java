package org.example.day8.ch13;

public class DataSwapping {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("n1: " + n1 + " n2: " + n2);
    }
}
