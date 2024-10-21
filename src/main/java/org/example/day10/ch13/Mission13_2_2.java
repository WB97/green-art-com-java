package org.example.day10.ch13;

import java.util.Arrays;

public class Mission13_2_2 {
    /*
    * 다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자
    *
    * 1 2 3 >> 1행
    * 4 5 6 >> 2행
    * 7 8 9 >> 3행
    *
    * 이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경시키는 메소드를 정의하자
    *
    * 7 8 9
    * 1 2 3
    * 4 5 6
    * */

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15}
        };

//        changeIdx(arr);
        changeIdxLoop(arr, 2);

        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }

    public static void changeIdx(int[][] arr) {
        int lastIdx = arr.length-1;
        int[] temp = arr[lastIdx];

        for (int i = lastIdx; i>0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }

    public static void changeIdxLoop(int[][] arr, int loop) {
        for (int i = 0; i < loop; i++) {
            changeIdx(arr);
        }
    }
}
