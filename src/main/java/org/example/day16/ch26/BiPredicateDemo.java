package org.example.day16.ch26;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<String, Integer> conv = (str, len) -> str.length() > len;

        System.out.println(conv.test("aaa", 4));

        String str1 = "Hello";
        String str2 = "Hllo";

        BiPredicate<String,String> conv2 = (s1, s2) -> s1.length() == s2.length();

        if(conv2.test(str1, str2)) {
            System.out.println("두 문자열의 길이는 같습니다.");
        } else {
            System.out.println("두 문자열의 길이는 다릅니다.");
        }
    }
}
