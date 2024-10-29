package org.example.day15.ch18;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        try {
            int age = readAge();
            System.out.println("age: " + age);
        } catch (ReadAgeException e) {
            e.getMessage();
        }
        System.out.println("=== end ===");
    }

    public static int readAge() throws ReadAgeException {
        Scanner scan = new Scanner(System.in);
        System.out.print("나이 입력: ");
        int age = scan.nextInt();
        if(age < 0) {
            scan.close();
            throw new ReadAgeException();
        }
        scan.close();
        return age;
    }
}

class ReadAgeException extends Exception {
    ReadAgeException() {
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}