package org.example.day16.ch26;

public class Lambda1 {
    public static void main(String[] args) {
        PrintableVer2 p2 = (s) -> System.out.println(s);

        p2.print("printttt");

        Calc sumCalc = (n1, n2) -> n1+n2;
        System.out.println(sumCalc.calc(5, 8));

        Calc minusCalc = (n1, n2) -> { return n1-n2;};
        System.out.println(minusCalc.calc(10, 8));
    }
}

@FunctionalInterface
interface PrintableVer2 {
    void print(String str);
}

@FunctionalInterface
interface Calc {
    int calc(int n1, int n2);
}