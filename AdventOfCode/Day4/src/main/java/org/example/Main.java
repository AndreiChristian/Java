package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PassportValidator passportValidator = new PassportValidator();
        PassportReader reader = new PassportReader();

        try{

            List<Passport> passports = reader.readPassports("src/main/resources/"+"input.txt");
            int validPassports = 0;

            for(Passport passport:passports){
                if (passportValidator.isValid(passport)){
                    validPassports ++;
                   System.out.println(
                           passport.getFields()
                   );
                }
            }

            System.out.println("Number of valid passports: " + validPassports);

        }catch (IOException e){
            System.err.println("Failed to read the file.");
        }

    }

}