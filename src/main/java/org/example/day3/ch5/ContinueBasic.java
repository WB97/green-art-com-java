package org.example.day3.ch5;

public class ContinueBasic {
    public static void main(String[] args) {
        for (int i=0; i<15; i++) {
            if(i == 9) continue;
            System.out.println(i);
        }
        System.out.println("--- end ---");
    }
}
