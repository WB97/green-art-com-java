package org.example.day3.newday3.ch5;

public class MissionWhile3 {
    public static void main(String[] args) {
        int mul = 2*7;
        int n = mul;
        int sum = 0;
        while (n <= 1000) {
            System.out.println(n);
            sum += n;
            n+=mul;
        }

        System.out.println(sum);
    }
}
