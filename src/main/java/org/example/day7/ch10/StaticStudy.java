package org.example.day7.ch10;

public class StaticStudy {
    public static void main(String[] args) {
//        NonStaticNumBox nnb1 = new NonStaticNumBox();
//        nnb1.n1 = 10;
//        nnb1.n2 = 30;
//
//        NonStaticNumBox nnb2 = new NonStaticNumBox();
//        nnb2.n1 = 15;
//        nnb2.n2 = 20;
//
//        nnb1.sum();
//        nnb2.sum();

        StaticNumBox snb1 = new StaticNumBox();
        StaticNumBox snb2 = new StaticNumBox();

//        StaticNumBox.sum();

//        snb1.n1 = 10;
//        snb1.n2 = 30;
//
//        snb2.n1 = 15;
//        snb2.n2 = 20;
//
//        snb1.sum();
//        snb2.sum();

        StaticNumBox.sum(10,20);
    }
}

class StaticNumBox {
    static int n1;
    static int n2;

    static void sum(int n1, int n2) {
        StaticNumBox staticNumBox = new StaticNumBox();
        System.out.println(n1+n2);
    }

    void hello() {
        System.out.println("Hello");
    }
}

class NonStaticNumBox {
    int n1;
    int n2;
    static int n3;
    static int n4;
    void sum() {
        System.out.println(n1 + n2);
        System.out.println(n3 + n4);
    }
}