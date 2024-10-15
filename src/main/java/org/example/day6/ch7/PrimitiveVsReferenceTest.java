package org.example.day6.ch7;

public class PrimitiveVsReferenceTest {
    public static void main(String[] args) {
        NumberBox nb = new NumberBox();
        nb.num = 10;
        changeNum(nb);
    }

    public static void changeNum(NumberBox nb) {
        nb.num = 100;
    }
}


class NumberBox {
    int num;
}