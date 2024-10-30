package org.example.day16.ch23;

import java.util.*;

public class HashMapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("홍길동", "시계");
        map.put("yoon", "JAVA");
        map.put("wook", "SPRING");

        String value = map.get("wook");

        System.out.println(value);
    }
}
