package org.example.day5.ch6;

public class MethodDef {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작");
        hiEveryone(13);
        System.out.println("프로그램의 끝");
    }

    private static void hiEveryone(int age) {
        System.out.println("좋은 아침입니다.");
        System.out.printf("제 나이는 %d입니다.\n", age);
    }
}
