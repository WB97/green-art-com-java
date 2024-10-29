package org.example.day15.ch18;

public class ExceptionStudy {
    public static void main(String[] args) {
        String str1 = "1";
        int intVal1 = myParseInt(str1);
        System.out.println(intVal1);
    }

    public static int myParseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
        }
        return 0;
    }
}
