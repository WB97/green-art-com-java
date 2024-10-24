package org.example.day13;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        int removeValue = list.remove();
        int removeValue2 = list.remove();
        list.remove();
        list.remove();

        System.out.println(removeValue);
        System.out.println(removeValue2);
        System.out.println(list);
    }
}
