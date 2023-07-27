package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderutil {

    public static List<String> readFile(String filename){

        Path filePath = Paths.get("src/main/resources/"+filename);
        System.out.println(filePath.toAbsolutePath());


        try{

            return Files.readAllLines(filePath);

        }catch (IOException e){

            System.out.println("Error reading file: " + filename);
            e.printStackTrace();
            return  null;
        }

    }

}
