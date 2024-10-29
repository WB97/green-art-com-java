package org.example.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        Path path = Paths.get("C:/study/greenart/Simple.txt");
        BufferedWriter writer;
        try {
            writer = Files.newBufferedWriter(path);
            writer.write("컴퓨터학원");
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

class FinallyCase2 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/study/greenart/Simple.txt");
        BufferedWriter writer = null;
        try {
            writer = Files.newBufferedWriter(path);
            writer.write("컴퓨터학원");
            writer.close();
        } catch (IOException e) {
            e.getMessage();
            try {
                if(writer == null) return;
                writer.close();
            } catch (IOException e2) {
                e2.getMessage();
            }
        }
    }
}

class FinallyCase3 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/study/greenart/Simple.txt");
        BufferedWriter writer = null;
        try {
            writer = Files.newBufferedWriter(path);
            writer.write("컴퓨터학원");
            writer.close();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                if(writer != null) {
                    writer.close();
                }
            } catch (IOException e) {

            }
        }
    }
}