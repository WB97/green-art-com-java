package org.example.day11.ch16;

public class PolyStudy {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal bullDog = new BullDog();
        Animal bird = new Bird();
        bullDog.crying();

//        BullDog bulldog2 =  new Dog();
//        BullDog bullDog2 = (BullDog) bullDog;
        System.out.println(bullDog instanceof Dog);
    }
}

class Animal {

    void crying() {
        System.out.println("동물이 운다~");
    }
}

class Cat extends Animal {
    @Override
    void crying() {
        System.out.println("고양이가 운다~");
    }
}

class Dog extends Animal {

    @Override
    void crying() {
        System.out.println("강아지가 운다~");
    }
}

class BullDog extends Dog {
    @Override
    void crying() {
        System.out.println("불독이 운다~");
    }

    void jump() {
        System.out.println("불독이 점프");
    }
}

class Bird extends Animal {

    @Override
    void crying() {
        System.out.println("새가 운다~");
    }
}