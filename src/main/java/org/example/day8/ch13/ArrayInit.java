package org.example.day8.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[5];

        int sum = 10;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum;
            sum+=10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
