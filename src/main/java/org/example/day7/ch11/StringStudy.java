package org.example.day7.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";
        String str3 = str1.concat(str2);

        System.out.println(str3);

        String str4 = "a";
        String str5 = "z";

//        System.out.println(str4.compareTo(str5));
//        System.out.println(str4.equalsIgnoreCase(str5));

        int n = 10;
        String str6 = String.valueOf(n);

//        System.out.println(str6);

        String fileName = "niceVery.Nice.jpg";
        System.out.println(".의 위치값: " + fileName.lastIndexOf("."));
    }
}
