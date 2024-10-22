package org.example.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}

class ClassA {

    public ClassA() {
        System.out.println("=====ClassA=====");
    }
}

class ClassB extends ClassA {

    public ClassB() {
        System.out.println("=====ClassB=====");
    }
}

class ClassC extends ClassB {

    public ClassC() {
        System.out.println("=====ClassC=====");
    }
}
