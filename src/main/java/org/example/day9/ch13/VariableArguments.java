package org.example.day9.ch13;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        sumVar(32,20);
        sumVar(32,20,22);
    }

    static void sumVar(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);
    }

    static void sum(int n1, int n2) {
        System.out.println(n1+n2);
    }

    static void sum(int n1, int n2, int n3) {
        System.out.println(n1+n2+n3);
    }
}
