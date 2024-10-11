package org.example.day4.ch5;

public class Mission05_7_1 {
    public static void main(String[] args) {

        for (int i=2; i<=8; i+=2) {
            for (int j = 1; j <=i; j++) {
                System.out.printf("%d x %d = %d", i, j, i*j);
                System.out.println();
            }
            System.out.println("===================");
        }
    }
}
