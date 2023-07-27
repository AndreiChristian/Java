package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IOReaderUtil {
    public static List<String> ReadFile(String fileName) {
        Path filePath = Paths.get("src/main/resources/" + fileName);
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
            return null;
        }
    }
}
