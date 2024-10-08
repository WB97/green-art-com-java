package org.example.day2.newday2.ch4;

public class PrintFormat {
    public static void main(String[] args) {

        String name = "홍길동";
        int age = 22;
        float height = 172.5f;
        char bloodType = 'O';
        boolean isMan = true;

//        System.out.printf("%s의 나이는 %d살 키는 %.1fcm 혈액형은 %c형입니다. 그는 남자입니까? %b", name, age, height, bloodType, isMan);

        int won = 230000000;
//        System.out.printf("%,d원", won);

        String result = String.format("%,d",1230);

        System.out.println(result);
    }
}
