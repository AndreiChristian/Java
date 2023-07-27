package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lines = IOReaderUtil.ReadFile("sample.txt");

        if(lines==null){
            System.out.println("Could not read file");
            return;
        }

        DatabasePasswordValidator.ValidateAllLines(lines);

    }
}