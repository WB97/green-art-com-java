package org.example.day2.newday2.ch5;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("성별을 입력해주세요(남/여) : ");
        String gender = sc.next();

        System.out.println("키를 정수값으로 입력해 주세요(cm) : ");
        int height = sc.nextInt();

        switch(gender) {
            case "남" :
                if(height > 172) {
                    System.out.println("당신은 평균보다 큽니다.");
                } else if(height == 172) {
                    System.out.println("당신은 평균입니다.");
                } else {
                    System.out.println("당신은 평균보다 작습니다.");
                }
                break;
            case "여" :
                if(height > 152) {
                    System.out.println("당신은 평균보다 큽니다.");
                } else if(height == 152) {
                    System.out.println("당신은 평균입니다.");
                } else {
                    System.out.println("당신은 평균보다 작습니다.");
                }
                break;
        }
    }
}
