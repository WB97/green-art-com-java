package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        List<Integer> list2 = Arrays.asList(1,2,3);
        System.out.println(list.getClass());
        System.out.println(list2.getClass());

        list2.add(1);

        System.out.println(list2);
    }
}