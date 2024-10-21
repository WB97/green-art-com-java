package org.example.day10.ch13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimenArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        int[][] arr2 = {
                {0,0,7,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
//        int[][][] arr3 = new int[3][5][2];

        int[] tmp1 = arr2[0];
        System.out.println(tmp1[2]);

        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for(int i2 = 0; i2 < arr[i].length; i2++) {
                arr[i][i2] = n++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int i2 = 0; i2 < arr[i].length; i2++) {
                System.out.print(arr[i][i2] + "\t");
            }
            System.out.println();
        }



    }
}
