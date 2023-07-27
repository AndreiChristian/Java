package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartOne {

    static void twoSum(List<String> lines, Integer targetValue){

        if (lines == null) {
            System.out.println("Error reading file");
            return;
        }

        Set<Integer> set = new HashSet<>();

        for (String line : lines) {
            try {
                Integer number = Integer.parseInt(line);

                if (set.contains(targetValue - number)) {

                    System.out.println(number * (targetValue - number));

                } else {

                    set.add(number);

                }
            } catch (NumberFormatException e){

                e.fillInStackTrace();

            }
        }

    }

}
