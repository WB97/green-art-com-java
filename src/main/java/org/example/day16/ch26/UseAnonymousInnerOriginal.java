package org.example.day16.ch26;

public class UseAnonymousInnerOriginal {
    public static void main(String[] args) {
        Printable printable = new PrintableImpl();
        printable.print();
    }
}

class PrintableImpl implements Printable {

    @Override
    public void print() {
        System.out.println("이름 있는 클래스 print");
    }
}