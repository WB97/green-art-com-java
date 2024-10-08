package org.example.day3.ch5;

public class RandomValue {
    public static void main(String[] args) {

        int rand = (int)(Math.random() * 12)+11;
        System.out.println("rand = " + rand);
        for (int i = 0; i < 20; i++) {
            System.out.println("(int)(Math.random() * 12)+11 = " + (int) (Math.random() * 12) + 11);
        }
    }
}
