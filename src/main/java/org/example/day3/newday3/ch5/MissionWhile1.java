package org.example.day3.newday3.ch5;

public class MissionWhile1 {
    public static void main(String[] args) {
        int n = 0;
        int c = 1;

        while(c < 100) {
            n += c++;
        }

        System.out.println(n);
    }
}
