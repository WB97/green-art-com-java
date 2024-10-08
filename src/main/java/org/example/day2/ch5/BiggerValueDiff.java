package org.example.day2.ch5;

public class BiggerValueDiff {
    public static void main(String[] args) {
        int num1=8;
        int num2=13;

        if(num1 < 0) {
            num1 = -num1;
        }
        if(num2 < 0) {
            num2 = -num2;
        }

        System.out.println(num1 < num2 ? num2-num1 : num1-num2);

    }
}
