package org.example.day2.newday2.ch5;

public class SwitchBasic {
    public static void main(String[] args) {
        int n = 3;
        switch (n) {
            case 1:
                System.out.println("Simple JAVA");
                break;
            case 2:
                System.out.println("Funny JAVA");
                break;
            case 3:
                System.out.println("Fantastic JAVA");
                break;
            default:
                System.out.println("The best programming language");
                break;
        }
        System.out.println("Do you like java?");
    }
}
