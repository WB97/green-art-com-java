package org.example.day14.ch17;

public abstract class AbstractStudy {

    public abstract void sum();
}

class ImplementsStudy extends AbstractStudy {

    @Override
    public void sum() {
        System.out.println("숫자 더하기");
    }
}

abstract class ImplementsStudy2 extends AbstractStudy {
}