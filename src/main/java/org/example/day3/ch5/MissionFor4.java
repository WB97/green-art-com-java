package org.example.day3.ch5;

public class MissionFor4 {
    public static void main(String[] args) {

        int gugudan = (int)(Math.random() * 10) + 2;

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n",gugudan,i,gugudan*i);
        }
    }
}
