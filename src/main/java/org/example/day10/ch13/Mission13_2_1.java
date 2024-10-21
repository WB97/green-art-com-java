package org.example.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        addOneDArr(arr, 3);
//        System.out.println(Arrays.toString(arr));

        int[][] arr2 = {
                {1,2,3},
                {4,5,6}
        };
        addTwoDArr(arr2, 4);
        for (int[] itemArr : arr2) {
            System.out.println(Arrays.toString(itemArr));
        }
    }

    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + add;
        }
    }

    public static void addTwoDArr(int[][] arr, int add) {
        for (int[] fArr : arr) {
            addOneDArr(fArr, add);
        }
    }
}
