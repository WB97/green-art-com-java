package org.example.day14.ch17;

public class PrintableInterFace {
    public static void main(String[] args) {

    }
}

interface Printable {
    public static final int num = 0;
    void print(String doc);
}

class PrintableImpl implements Printable {

    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}