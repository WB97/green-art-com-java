package org.example.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10); //0번방에 10값이 주입
        list.add(20); //1번방에 20값이 주입

        ArrayList list2 = (ArrayList) list;
        list2.add(30); //2번방에 주입
        list2.add(3); //3번방에 주입

        String val3 = String.valueOf(list2.get(3)); // 3번 방에 있는 값 읽기
        System.out.println("val3: " + val3);
    }
}
