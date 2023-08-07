package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PassportReader {

    public List<Passport> readPassports(String fileName) throws IOException {

        List<Passport> passports = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            Passport passport = new Passport();

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                if (line.isEmpty()) {
                    passports.add(passport);
                    passport = new Passport();

                } else {

                    String[] parts = line.split(" ");

                    for (String part : parts) {
                        String[] fields = part.split(":");
                        passport.addField(fields[0], fields[1]);
                    }
                }
            }
            passports.add(passport);
        }
        return passports;
    }
}
