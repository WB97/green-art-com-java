package org.example.day7.ch7;

public class Car {
    private String color;
    private String gearType;
    private int door;

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public void introduce() {
        System.out.println(color + " 컬러의 " + gearType + " 기어를 가진 " + door + "개의 문짝이 있는 자동차");
    }

    static class CarTest {
        public static void main(String[] args) {
//            Car c1 = new Car("white", "auto", 4);
//            Car c2 = new Car("red", "manual", 5);
//            c1.introduce();
//            c2.introduce();

            Car c4 = new Car("white", "auto", 6);
            c4.introduce();

        }
    }
}
