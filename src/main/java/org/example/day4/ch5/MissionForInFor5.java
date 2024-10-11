package org.example.day4.ch5;

public class MissionForInFor5 {
    public static void main(String[] args) {

        int star = (int)(Math.random()*6)+3;

        System.out.println(star);

        for (int i = 0; i < star; i++) {
            for (int j = star-1; j > i; j--) {
                System.out.print("_");
            }
            for (int j = star-i; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
