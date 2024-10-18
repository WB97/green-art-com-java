package org.example.day9.ch13;

public class Mission13_1 {
    public static void main(String[] args) {

        int[] arr = {43, 88, 100, -3, -220, 67, 1};

        int min = minValue(arr);
        int max = maxValue(arr);

        System.out.println(min + " " + max);

    }

    static int minValue(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            result = arr[i] < result ? arr[i] : result;
        }
        return result;
    }

    static int maxValue(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        int result = arr[0];
        for (int i : arr) {
            result = i > result ? i : result;
        }
        return result;
    }
}
