package org.example.day2.ch5;

public class IfReit2 {
    public static void main(String[] args) {
        int num = -124;

        if(num < 0 && num % 2 == 0) {
            System.out.println("음수면서 짝수");
        } else if(num >= 0) {
            System.out.println("나머지");
        }
        System.out.println("끝");
    }
}
