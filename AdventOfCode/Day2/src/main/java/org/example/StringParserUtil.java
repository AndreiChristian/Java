package org.example;

public class StringParserUtil {
    public static String[] splitLineBySpace(String line) {
        return line.split(" ");
    }

    public static int[] parseRange(String rangeStr) {
        String[] rangeParts = rangeStr.split("-");
        return new int[] {
                Integer.parseInt(rangeParts[0]),
                Integer.parseInt(rangeParts[1])
        };
    }
}
