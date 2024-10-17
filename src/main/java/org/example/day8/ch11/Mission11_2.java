package org.example.day8.ch11;

public class Mission11_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("990925-101299");
        int index = sb.indexOf("-");
        sb.replace(index, index+1, " ");
        System.out.println(sb);
    }
}
