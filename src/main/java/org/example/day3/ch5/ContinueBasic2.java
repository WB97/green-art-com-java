package org.example.day3.ch5;

public class ContinueBasic2 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 15) {
            if(i==9) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("--- end ---");
    }
}
