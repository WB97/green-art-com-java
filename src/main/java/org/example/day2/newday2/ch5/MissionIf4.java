package org.example.day2.newday2.ch5;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101);
        System.out.printf("%d점\n", score);

        if(score >= 98) {
            System.out.println("A+");
        } else if( score >= 94) {
            System.out.println("A0");
        } else if( score >= 90) {
            System.out.println("A-");
        } else if( score >= 88) {
            System.out.println("B+");
        } else if( score >= 84) {
            System.out.println("B0");
        } else if( score >= 80) {
            System.out.println("B-");
        } else if( score >= 78) {
            System.out.println("C+");
        } else if( score >= 74) {
            System.out.println("C0");
        } else if( score >= 70) {
            System.out.println("C-");
        } else {
            System.out.println("D");
        }
    }
}
