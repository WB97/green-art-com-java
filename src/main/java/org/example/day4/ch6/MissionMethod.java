package org.example.day4.ch6;

public class MissionMethod {

    public static void main(String[] args) {
//        printStar(9);
//        printStar(2);
        printStarSquare(4);
//        printStarSquare(10);
//        printStarTriangle(4);
    }

    static void printStar(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printStarSquare(int n) {
        for (int i = 0; i < n; i++) {
            printStar(n);
        }
    }

    private static void printStarTriangle(int n) {
            for(int i = 1; i <= n; i++) {
                printStar(i);
            }
    }
}
