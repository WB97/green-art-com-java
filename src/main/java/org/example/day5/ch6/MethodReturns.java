package org.example.day5.ch6;

public class MethodReturns {
    public static void main(String[] args) {
//        int result = adder(4,5);
//        System.out.println(result);

        double result = square(3.5);
        System.out.printf("%.2f x %.2f = %.2f", 3.5, 3.5, result);
    }

    private static int adder(int n1, int n2) {
        return n1+n2;
    }

    private static double square(double n1) {
        return n1*n1;
    }
}
