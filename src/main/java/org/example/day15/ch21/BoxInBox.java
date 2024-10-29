package org.example.day15.ch21;

public class BoxInBox {
    public static void main(String[] args) {
        BoxGeneric<String> sBox = new BoxGeneric<>("happy");

        BoxGeneric<BoxGeneric<String>> wBox = new BoxGeneric<>(sBox);

        BoxGeneric<BoxGeneric<BoxGeneric<String>>> zBox = new BoxGeneric<>(wBox);

        BoxGeneric<BoxGeneric<String>> box =  zBox.getFruit();
    }
}
