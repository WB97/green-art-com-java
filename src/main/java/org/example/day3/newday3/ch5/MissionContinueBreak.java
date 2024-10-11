package org.example.day3.newday3.ch5;

public class MissionContinueBreak {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; true; i+=2) {
            sum+=i;
            if(sum > 1000) {
                System.out.println("i = " + i);
                System.out.println("sum = " + sum);
                break;
            }
        }
        System.out.println(sum);
    }
}
