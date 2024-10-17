package org.example.day8.ch13;

public class ArrayIsInstance2 {

    public static void main(String[] args) {

        Box[] arr = new Box[10];
        Box box = new Box("Hello");
//        System.out.println(box);

        arr[0] = box;
        arr[1] = new Box("word");
        arr[2] = new Box("!!");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    static class Box {
        private String conts;

        Box(String conts) {
            this.conts = conts;
        }

        public String toString() {
            return conts;
        }
    }
}
