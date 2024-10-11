package org.example.day3.newday3.ch5;

public class DoWhileBasic {
    public static void main(String[] args) {

        int n = 11;

        do {
            System.out.println("I like java" + n++);
        } while(n < 5);

        System.out.println("==끝==");
    }
}
