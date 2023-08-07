package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PassportValidator {
    private static final Set<String> REQUIRED_FIELDS = new HashSet<>(
            Arrays.asList("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")
    );

    public boolean isValid(Passport passport) {
        Map<String, String> fields = passport.getFields();
        return fields.keySet().containsAll(REQUIRED_FIELDS);
    }
}

