package org.example.day2.ch4;

public class PrePostfixOp {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("num1++ : " + num1++);
        System.out.println("num1++ : " + num1++);
        System.out.println("num1 : " + num1);

        System.out.println();

        int num2 = 10;
        System.out.println("++num2 : " + ++num2);
        System.out.println("++num2 : " + ++num2);
        System.out.println("num2 : " + num2);
    }
}
