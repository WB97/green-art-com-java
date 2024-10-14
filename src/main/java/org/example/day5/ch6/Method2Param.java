package org.example.day5.ch6;

public class Method2Param {
    public static void main(String[] args) {
        hiEveryone(12, 169.8);
        hiEveryone(13, 175.2);
        byEveryone();
    }

    private static void hiEveryone(int age, double height) {
        System.out.printf("제 나이는 %d입니다.\n", age);
        System.out.printf("제 키는 %.1f입니다.\n", height);
    }

    private static void byEveryone() {
        System.out.println("다음에 뵙겠습니다.");
    }
}
