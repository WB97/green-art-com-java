package org.example.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        NumBox numBox = new NumBox(2);
        System.out.println(numBox);
    }
}

class NumBox {
    private int num;

    NumBox(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

//    public boolean equals(Object obj) {
//        return num
//    }
}