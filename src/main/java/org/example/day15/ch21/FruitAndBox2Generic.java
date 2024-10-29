package org.example.day15.ch21;

public class FruitAndBox2Generic {
    public static void main(String[] args) {
        BoxGeneric<Apple> appleBox = new BoxGeneric<>(new Apple());
        BoxGeneric<Orange> orangeBox = new BoxGeneric<>(new Orange());

        System.out.println(appleBox.getFruit());
        System.out.println(orangeBox.getFruit());
    }
}

class BoxGeneric<T> {
    private T fruit;

    public BoxGeneric(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}