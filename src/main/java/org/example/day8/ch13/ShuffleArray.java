package org.example.day8.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            arr[i] = i+1;
        }



        for (int i = 0; i < size; i++) {
            int rIdx = (int)(Math.random()*20);
            int temp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
