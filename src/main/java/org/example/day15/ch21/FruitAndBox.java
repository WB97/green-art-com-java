package org.example.day15.ch21;

public class FruitAndBox {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Orange orange1 = new Orange();

        AppleBox appleBox = new AppleBox(apple1);
        OrangeBox orangeBox = new OrangeBox(orange1);
    }
}

class Apple {
    public String toString() {
        return "사과";
    }
}

class Orange {
    public String toString() {
        return "오렌지";
    }
}

class AppleBox {
    private Apple ap;

    public AppleBox(Apple ap) {
        this.ap = ap;
    }

    public Apple getAp() {
        return ap;
    }
}

class OrangeBox {
    private Orange orange;

    public OrangeBox(Orange orange) {
        this.orange = orange;
    }

    public Orange getOrange() {
        return orange;
    }
}
