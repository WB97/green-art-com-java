package org.example.day7.ch11;

public class MissionExt {
    public static void main(String[] args) {
        String filename = "nice_v.ery.Nice.jpg";

        int lastIndex = filename.lastIndexOf(".");

        String ext = filename.substring(lastIndex+1);

        System.out.println(ext);
    }
}
