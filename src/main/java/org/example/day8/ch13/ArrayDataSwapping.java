package org.example.day8.ch13;

import java.util.Arrays;

public class ArrayDataSwapping {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
