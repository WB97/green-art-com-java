package org.example.day8.ch13;

import java.util.Arrays;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 1, 8};
        int size = arr.length;
        int[] copyArr = new int[size];

        for (int i = 0; i < size; i++) {
            copyArr[i] = arr[i];
        }

        System.out.println(Arrays.toString(copyArr));

    }
}
