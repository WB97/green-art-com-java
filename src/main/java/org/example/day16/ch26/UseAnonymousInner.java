package org.example.day16.ch26;

public class UseAnonymousInner {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("익명 프린터");
            }
        };

        Printable p2 = () -> {
            System.out.println("람다 익명 프린터");
        };

        p.print();
        p2.print();
    }
}

@FunctionalInterface
interface Printable {
    void print();
}