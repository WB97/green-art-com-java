package org.example;

import org.example.day6.ch9.AccessLevelModifiers;

public class Main {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);

        System.out.println(System.identityHashCode(i));
    }
}