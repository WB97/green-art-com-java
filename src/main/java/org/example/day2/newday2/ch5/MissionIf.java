package org.example.day2.newday2.ch5;

public class MissionIf {
    public static void main(String[] args) {
        int n = 120;
//        if(n > 0) {
//            if(n % 2 == 0) {
//                System.out.printf("%d는 양수이면서 짝수이다.\n", n);
//            }
//        }
//        System.out.println("끝");

        if(n > 0 && n % 2 == 0) {
            System.out.printf("%d는 양수이면서 짝수이다.\n", n);
        }
        System.out.println("끝");
    }
}
