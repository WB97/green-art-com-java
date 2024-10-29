package org.example.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("a/b ... a?");
            int n1 = sc.nextInt();
            System.out.print("a/b ... b?");
            int n2 = sc.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=============(2)============");

        try {
            System.out.print("a/b ... a?");
            int n1 = sc.nextInt();
            System.out.print("a/b ... b?");
            int n2 = sc.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
        } catch (InputMismatchException | ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("종료");

        System.out.println("=============(3)============");

        try {
            System.out.print("a/b ... a?");
            int n1 = sc.nextInt();
            System.out.print("a/b ... b?");
            int n2 = sc.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
