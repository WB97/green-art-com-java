package org.example.day7.ch10;

public class ClassVar {
    public static void main(String[] args) {
        int n = InstCnt.instNum;
    }

    static class InstCnt {
        public static int instNum = 0;

        InstCnt() {
            instNum++;
            System.out.println("인스턴스 생성 " + instNum);
        }
    }
}


