package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PartTwo {

    public static void partTwo(List<String> lines, Integer targetValue) {

        if (lines == null) {
            System.out.println("Error reading input file");
            return;
        }

        List<Integer> numbers = new ArrayList<>();
        for (String line : lines) {
            try {
                numbers.add(Integer.parseInt(line));
            } catch (NumberFormatException e) {
                System.out.println("Could not parse line into an integer: " + line);
                return;
            }
        }

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size() - 2; i++) {

//           skipping duplicates
            if (i > 0 && numbers.get(i).equals(numbers.get(i - 1))) {
                continue;
            }

            int j = i+1;
            int k = numbers.size() -1;

            while(j < k){

                int sum = numbers.get(i) + numbers.get(j) + numbers.get(k);

                if(sum == targetValue){
                    System.out.println(numbers.get(i)*numbers.get(j)*numbers.get(k));
                    break;
                } else if (sum <targetValue) {
                    j++;
                } else {
                   k--;
                }

            }

        }

    }
}
