package org.example.day4.ch6;

public class MethodAritOp {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        minus(n1,n2);
        multiply(n1,n2);
        float f = divide(n1,n2);
        int r2 = mod(n1,n2);
    }

    static void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, n1-n2);
    }

    static void multiply(int n1, int n2) {
        System.out.printf("%d x %d = %d\n", n1, n2, n1*n2);
    }

    static float divide(int n1, int n2) {
        System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
        return n1/(float)n2;
    }

    static int mod(int n1, int n2) {
        System.out.printf("%d %% %d = %d\n", n1, n2, n1%n2);
        return n1/n2;
    }
}
