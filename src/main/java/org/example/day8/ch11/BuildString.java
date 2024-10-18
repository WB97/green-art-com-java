package org.example.day8.ch11;

public class BuildString {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("123kkklkl");
//        String str = "asdwdas";
//
//        String a = str.replace("a", "1");
//        System.out.println(a);

//        sb.append(45678);
//        System.out.println(sb);

//        sb.delete(0, sb.length());
//        System.out.println(sb);

//        sb.replace(0, 3, "ab");
//        System.out.println(sb);
//
//        sb.reverse();
//        System.out.println(sb);

        StringBuilder sb3 = new StringBuilder("123");
        sb3.append(45678).delete(0,2).replace(0,3,"kkk");
        System.out.println("sb3 = " + sb3);

    }
}
