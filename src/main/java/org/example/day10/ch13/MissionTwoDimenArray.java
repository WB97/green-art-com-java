package org.example.day10.ch13;

import org.example.day8.ch13.ArrayStudy;

import java.util.Arrays;

public class MissionTwoDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                // 국 영 수
                {100, 90, 80}, // 영수
                {90, 90, 80}, // 상철
                {80, 70, 60} // 광수
        };

        int[] users = new int[score.length];
        int[] Subject = new int[score[0].length];
        int totalLankSum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int i2 = 0; i2 < score[i].length; i2++) {
                users[i] += score[i][i2];
                Subject[i] += score[i2][i];
                totalLankSum += score[i][i2];
            }
        }

        double totalAvgGuk = (double) Subject[0] /score.length;
        double totalAvgEn = (double) Subject[1] /score.length;;
        double totalAvgSu = (double) Subject[2] /score.length;;

//        System.out.println(Arrays.toString(users));

        int yungSum = users[0];
        int sangSum = users[1];
        int gwangSUm = users[2];

        double yungAvg = users[0]/(double)score[0].length;
        double sangAvg = users[1]/(double)score[1].length;
        double gwangAVg = users[2]/(double)score[2].length;



        System.out.println("영수 합계: " + yungSum);
        System.out.println("상철 합계: " + sangSum);
        System.out.println("광수 합계: " + gwangSUm);
        System.out.println("=============");

        System.out.println("영수 평균: " + yungAvg);
        System.out.println("상철 평균: " + sangAvg);
        System.out.println("광수 평균: " + gwangAVg);
        System.out.println("=============");

        System.out.println("국어 합계: " + Subject[0]);
        System.out.println("영어 합계: " + Subject[1]);
        System.out.println("수학 합계: " + Subject[2]);
        System.out.println("=============");

        System.out.println("국어 평균: " + (double)Subject[0]/score.length);
        System.out.println("영어 평균: " + (double)Subject[1]/score.length);
        System.out.println("수학 평균: " + (double)Subject[2]/score.length);
        System.out.println("=============");

        System.out.println("전체 점수: " + totalLankSum);



    }
}
