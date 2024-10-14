package org.example.day5.ch6;

public class Mission06_1_1 {
    public static void main(String[] args) {
        calc(10,3);
    }

    private static void calc(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
        System.out.printf("%d - %d = %d\n", n1, n2, n1-n2);
        System.out.printf("%d / %d = %f\n", n1, n2, n1/(float)n2);
        System.out.printf("%d x %d = %d\n", n1, n2, n1*n2);
        System.out.printf("%d %% %d = %d\n", n1, n2, n1%n2);
    }
}
