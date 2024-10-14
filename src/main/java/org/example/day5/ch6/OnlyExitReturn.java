package org.example.day5.ch6;

public class OnlyExitReturn {
    public static void main(String[] args) {
        divide(4, 2);
        divide(6, 2);
        divide(9, 0);
        System.out.println("==끝==");
    }

    static void divide(int n1, int n2) {
        if(n2 == 0) return;
        System.out.printf("나눗셈 결과: %d\n", n1/n2);
    }
}
