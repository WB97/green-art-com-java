package org.example.day6.ch9;

public class UnsafeCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRad(1.5);
        System.out.println("원의 넓이(1) : " + circle.getArea());
        circle.setRad(2.5);
        System.out.println("원의 넓이(2) : " + circle.getArea());
        circle.setRad(-2.5);
        System.out.println("원의 넓이(2) : " + circle.getArea());
    }
}
