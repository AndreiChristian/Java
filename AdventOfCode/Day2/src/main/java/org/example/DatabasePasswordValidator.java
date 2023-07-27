package org.example;

import java.util.List;

public class DatabasePasswordValidator {

    private static boolean validateLine(String line){

        String[] fields = line.split(" ");

        System.out.println("------");
        System.out.println(fields[0]);
        System.out.println(fields[1]);
        System.out.println(fields[2]);
        System.out.println("------");


        return true;

    }

    public static void ValidateAllLines(List<String> lines){

        for(String line:lines){
            validateLine(line);
        }
    }

}
