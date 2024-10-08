package org.example.day2.newday2.ch5;

import java.util.Scanner;

public class SwitchStudy {
    public static void main(String[] args) {
        String name = new String("홍길동");
        String name2 = new String("홍길동");

        System.out.printf("name: %s\n", name);
        System.out.printf("name2: %s\n", name2);

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력해주세요: ");
        String input = sc.next();
        switch (input) {
            case "abc" :
                System.out.println("switch-def");
                break;
        }
        System.out.println("끝");
    }
}
