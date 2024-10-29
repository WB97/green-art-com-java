package org.example.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {

        Path path = Paths.get("C:/study/greenart/Simple.txt");

        try(BufferedWriter writer = Files.newBufferedWriter(path); Scanner sc = new Scanner(System.in)) {
            AutoCloseable auto = writer;
            auto = sc;
            writer.write("Finally Case");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
