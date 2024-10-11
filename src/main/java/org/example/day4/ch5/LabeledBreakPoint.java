package org.example.day4.ch5;

public class LabeledBreakPoint {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 10; i++) {
            for (int z = 1; z < 10; z++) {
                if(i*z == 72) {
                    System.out.printf("%d x %d = %d\n", i, z , i*z);
                    break outer;
                }
            }
        }

        System.out.println("끝");
    }
}
