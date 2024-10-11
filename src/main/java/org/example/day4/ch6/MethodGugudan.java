package org.example.day4.ch6;

public class MethodGugudan {
    public static void main(String[] args) {
//        gugudan(1);
        gugudanFromTo(8, 9);
    }

    static void gugudan(int dan) {
        for(int i=1; i<=9; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
        }
    }

    static void gugudanFromTo(int dan1, int dan2) {
        for(int i=dan1; i<=dan2; i++) {
            gugudan(i);
            System.out.println("=============================");
        }
    }
}
