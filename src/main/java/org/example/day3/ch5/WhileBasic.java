package org.example.day3.ch5;

public class WhileBasic {
    public static void main(String[] args) {
        int num = 0;
        while(num < 5) {
            System.out.println("I like java" + num);
            num++;
        }
        System.out.println("---------------------");
        for(int num2 = 0; num2 < 5; num2++) {
            System.out.println("I like java" + num2);
        }
    }
}
