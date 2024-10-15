package org.example.day6.ch9;

public class InfoHideCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRad(1.5);
        System.out.println("원의 넓이(1): " + circle.getArea());

        circle.setRad(-3.3);
        System.out.println("원의 넓이(2): " + circle.getArea());

    }
}

class Circle2 {
    private double rad = 0;
    final double PI = 3.14;

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }
    public double getArea() {
        return (rad * rad) * PI;
    }
}