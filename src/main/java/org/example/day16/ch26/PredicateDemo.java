package org.example.day16.ch26;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> preMore10 = n -> n>10;

        System.out.println(preMore10.test(11));
        examPredicate(n -> n>10, 9);

        Predicate<String> preCheckGender = s -> {
            return s.equals("남") || s.equals("남자") || s.equals("여") || s.equals("여자");
        };

        Predicate<String> preCheckGender2 = s -> switch (s){
            case "남", "남자", "여", "여자" -> true;
            default -> false;
        };

        String gender = "남";
        if (preCheckGender.test(gender)) {
            System.out.println("확인");
        } else {
            System.out.println("다시입력");
        }
    }

    public static void examPredicate(Predicate<Integer> p, int n) {
        System.out.println(p.test(n));
    }
}
