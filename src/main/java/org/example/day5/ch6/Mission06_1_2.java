package org.example.day5.ch6;

public class Mission06_1_2 {
    public static void main(String[] args) {
        int result = calc(3,-10);
        System.out.println(result);
    }

    private static int calc(int n1, int n2) {
        return n1 > n2 ? n1-n2 : n2-n1;
    }
}
