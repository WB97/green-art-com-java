package org.example.day2.newday2.ch5;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 : ");

        int input = sc.nextInt();
        System.out.printf("input : %d\n", input);
        if(input % 2 == 0) System.out.printf("%d는 짝수 입니다.\n",input);
        else System.out.printf("%d는 홀수 입니다.\n", input);

        System.out.println("끝");

    }
}
