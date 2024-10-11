package org.example.day4.ch5;

public class Mission05_7_2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 9;
        for (int i = 0; i <= 9; i++) {
            if(a + b == 9) {
                System.out.printf("a = %d, b = %d", a, b);
                System.out.println();
            }
            a += 1;
            b -= 1;
        }
    }
}
