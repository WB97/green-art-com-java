package org.example.day5.ch6;

public class Mission06_2_1 {

    public static void main(String[] args) {
        double result1 = circle1(5);
        double result2 = circle2(5);

        System.out.println(result1);
        System.out.println(result2);
    }

    static double circle1(int n1) {
        return n1*n1*Math.PI;
    }

    static double circle2(int n1) {
        return (2*Math.PI) * n1;
    }
}
