package org.example.day4.ch6;

public class MethodRelationalOp {
    public static void main(String[] args) {
        int n1 = 22;
        int n2 = 22;

//        int bigger1 = biggerNumber(n1, n2);
//        System.out.println("더 큰값은 " + bigger1 + "입니다.");
//        int bigger2 = biggerNumber(30, 11);
//        System.out.println("더 큰값은 " + bigger2 + "입니다.");

        if(isEquals(n1, n2)) {
            System.out.printf("%d와 %d값은 같습니다.", n1, n2);
        }
    }

    static boolean isEquals(int n1, int n2) {
        return n1 == n2;
    }

    static int biggerNumber(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}
