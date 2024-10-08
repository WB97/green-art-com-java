package org.example.day3.ch5;

public class BreakBasic {
    public static void main(String[] args) {
        int num = 1;
        boolean search = false;

        while(num < 100) {
            if(num % 5 == 0 && num % 7 == 0) {
                search = true;
                break;
            }
            num++;
        }
        if(search) {
            System.out.println("찾는 정수 : " + num);
        } else {
            System.out.println("못 찾았습니다,");
        }
        System.out.println(num);
    }
}
