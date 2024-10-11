package org.example.day3.newday3.ch5;

public class MissionForInFor3 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6)+3;

        System.out.println(star);

//        for (int i = 0; i < star; i++) {
//            for (int j = 0; j < star; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= star*star; i++) {
            System.out.print("*");
            if(i % star == 0) System.out.println();;
        }
    }
}
