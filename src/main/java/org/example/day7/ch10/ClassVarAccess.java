package org.example.day7.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay accessWay = new AccessWay();
        accessWay.increaseCnt();
        accessWay.num++;
        AccessWay.num++;
        System.out.println("num: " + AccessWay.num);
        System.out.println("num: " + accessWay.num);
    }
}

class AccessWay {
    static int num = 0;

    AccessWay() {
        increaseCnt();
    }

    void increaseCnt() {
        num++;
    }
}
