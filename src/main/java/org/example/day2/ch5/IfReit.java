package org.example.day2.ch5;

public class IfReit {
    public static void main(String[] args) {
        int num = -121;

        if(num > 0) {
            if(num % 2 == 0) {
                System.out.println("양수 짝수");
            } else {
                System.out.println("양수 홀수");
            }
        } else {
            if(num % 2 == 0) {
                System.out.println("음수 짝수");
            }  else {
                System.out.println("음수 홀수");
            }
        }
    }
}
