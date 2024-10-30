package org.example.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom1 = () -> (int)(Math.random() * 50.0);
        Supplier<Integer> supRandom2 = () -> (int)(Math.random() * 31.0)+20;

//        System.out.println(supRandom.get());

        List<Integer> list1 = makeIntList(supRandom1, 5);
        List<Integer> list2 = makeIntList(supRandom2, 8);

        System.out.println(list1);
        System.out.println(list2);
    }

    static List<Integer> makeIntList(Supplier<Integer> supRan, int num) {
        ArrayList<Integer> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add(supRan.get());
        }
        return list;
    }
}
