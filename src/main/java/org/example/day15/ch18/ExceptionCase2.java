package org.example.day15.ch18;

public class ExceptionCase2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;

        try {
            System.out.printf("%d / %d = %d", n1, n2, n1/n2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=== 종료 ===");
    }
}
