package org.example;

import java.util.List;

public class DatabasePasswordValidator {

    public static void validateAllLines(List<String> lines) {
        long count = lines.stream().filter(DatabasePasswordValidator::validateLine).count();
        System.out.println(count);
    }

    private static boolean validateLine(String line) {
        String[] parts = line.split(" ");
        String[] positions = parts[0].split("-");
        char targetChar = parts[1].charAt(0);
        String password = parts[2];

        int pos1 = Integer.parseInt(positions[0]) -1;
        int pos2 = Integer.parseInt(positions[1]) -1;

        return password.charAt(pos1) == targetChar ^ password.charAt(pos2)==targetChar;
    }
}
