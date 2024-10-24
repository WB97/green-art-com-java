package org.example.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i=1; i<10; i++) {
            System.out.println(list.size());
            list.add(i);
            System.out.println(list);
        }
        list.clear();
        System.out.println(list);

        for (int i=1; i<10; i++) {
            System.out.println(list.size());
            list.add(i);
            System.out.println(list);
        }
    }
}
