package org.example.day4.ch6;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1 = 5;
//        boolean b = logicalOp(n1);
//        System.out.println(b);

        boolean b2 = logicalOp2(n1);
        System.out.println(b2);
    }

    static boolean logicalOp(int n1) {
        return n1 >= 1 && n1 <= 100;
    }

    static boolean logicalOp2(int n1) {
        return n1%2==0 || n1%3==0;
    }
}
