package org.example.day2.ch4;

public class LogicalOp2 {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;

        boolean result;

        result = (1<num1) && (num1 < 100);
        System.out.println("num1은 1 초과 100 미만인가?" + result);

        result = num1 == 0;
        System.out.println("num1은 0인가? " + result);
    }
}
