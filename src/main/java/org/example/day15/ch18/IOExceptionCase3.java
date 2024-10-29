package org.example.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class IOExceptionCase3 {
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=== 끝 ===");
    }

    public static void md1() throws IOException {
        md2();
    }

    public static void md2() throws IOException {
        Path path = Paths.get("C:/study/greenart/Simple.txt");
        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("컴퓨터학원");
        writer.close();
    }
}
