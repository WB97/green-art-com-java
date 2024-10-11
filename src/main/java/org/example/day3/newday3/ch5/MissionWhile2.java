package org.example.day3.newday3.ch5;

public class MissionWhile2 {
    public static void main(String[] args) {
        int n = 0;

        while(n < 100) {
            System.out.println(++n);
        }
        System.out.println("=====");
        do {
            System.out.println(n--);
        }while (n > 0);
    }
}
