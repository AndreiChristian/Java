package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer targetValue = 2020;

        List<String> lines = FileReaderutil.readFile("input.txt");

//        PartOne.twoSum(lines, targetValue);

        PartTwo.partTwo(lines, targetValue);

    }
}