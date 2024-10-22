package org.example.day11.ch16;

public class OverridingToString {
    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println(cake);
        CheeseCake cheeseCake = new CheeseCake();
        System.out.println(cheeseCake);

        Cake c2 = new CheeseCake();
    }
}

class Cake {

    @Override
    public String toString() {
        return "My birthday cake";
    }

    final void blowCandle() {
        System.out.println("초를 분다.");
    }
}

final class CheeseCake extends Cake {

    @Override
    public String toString() {
        return "My birthday cheeses cake";
    }
}