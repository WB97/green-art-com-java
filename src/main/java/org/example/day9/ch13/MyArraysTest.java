package org.example.day9.ch13;

import java.util.Arrays;

public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 10, 66, 7};
        System.out.println(MyArrays.toString(arr));

//        int[] arr2 = Arrays.copyOf(arr, arr.length);
//        System.out.println(MyArrays.toString(arr2));
//        System.out.println(arr == arr2);
//
//        int[] arr3 = MyArrays.copyOf(arr);
//        System.out.println(MyArrays.toString(arr3));
//        System.out.println(arr == arr3);

        int[] arr4 = MyArrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr4));
    }
}
