package org.example.day16.ch26;

public class MemberInner {
    public static void main(String[] args) {
        Outer2 outer1 = new Outer2();
        Outer2 outer2 = new Outer2();

        Outer2.Member m1 = outer1.new Member();
        Outer2.Member m2 = outer2.new Member();

        m1.add(10);
        m2.add(30);

        System.out.println(m1.get());
        System.out.println(m2.get());
    }
}

class Outer2 {
    private int num = 0;

    class Member {
        void add(int val) {
            num += val;
        }

        int get() {
            return num;
        }
    }
    int parentGet() {
        return num;
    }
}
