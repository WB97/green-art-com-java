package org.example.day6.ch9;

public class Circle {
    double rad = 0;
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
