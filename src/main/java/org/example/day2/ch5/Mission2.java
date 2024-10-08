package org.example.day2.ch5;

public class Mission2 {
    public static void main(String[] args) {
        int num1 = -10;

        System.out.println(num1 < 0 ? -num1 : num1);

        if(num1 < 0) {
            System.out.println(-num1);
        } else {
            System.out.println(num1);
        }

    }
}
