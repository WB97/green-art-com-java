package org.example.day3.ch5;

public class Mission1 {
    public static void main(String[] args) {
        int mon = (int) (Math.random()*12)+1;

        System.out.println(mon);

        switch (mon) {
            case 1,2,12 :
                System.out.println("겨울");
                break;
            case 3,4,5 :
                System.out.println("봄");
                break;
            case 6,7,8 :
                System.out.println("여름");
                break;
            case 9,10,11 :
                System.out.println("가을");
                break;
        }
    }
}
