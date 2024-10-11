package org.example.day3.newday3.ch5;

public class ForInFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("================");

            for (int n = 0; n < 5; n++) {
                System.out.printf("[%d, %d]\n", i, n);
            }
        }
    }
}
