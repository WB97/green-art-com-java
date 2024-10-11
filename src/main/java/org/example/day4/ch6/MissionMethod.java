package org.example.day4.ch6;

public class MissionMethod {

    public static void main(String[] args) {
        printStar(5);
        printStar(2);
    }

    static void printStar(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
