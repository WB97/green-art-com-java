package org.example.day2.ch5;

public class BiggerValue {
    public static void main(String[] args) {
        int num1 = -11;
        int num2 = -20;

        if(num1 <= 100 && num2 <= 100) {
            System.out.println(num1 > num2 ? num1 : num2);
        }
    }
}
