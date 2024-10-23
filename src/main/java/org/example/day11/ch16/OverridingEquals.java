package org.example.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {

        NumBox numBox1 = new NumBox(2);
        NumBox numBox2 = new NumBox(2);
        NumBox numBox3 = new NumBox(4);

        System.out.println(numBox1.equals(numBox2));
    }
}

class NumBox {
    private int num;

    NumBox(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    public boolean equals(Object obj) {
        if(obj instanceof NumBox) {
            return num == ((NumBox) obj).getNum();
        }
        return false;
    }
}