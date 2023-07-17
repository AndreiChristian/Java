import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] cars = {"Camaro", "Corvette", "Mustang"};

//            cars[4] = "Tesla";

        for (int i = 0; i < cars.length; i++) {

            System.out.println(cars[i]);

        }

        String name = "Andrei";

        boolean isEqual = name.equals("Andre");

        System.out.println(isEqual);

        name.toLowerCase();
        name.toUpperCase();

        int charAtIndex = name.indexOf(3);

        ArrayList<String> dogs;

        dogs = new ArrayList<String>();

        dogs.add("Beagle");
        dogs.add("German Sh");
        dogs.add("German Separd");
        dogs.add("Germhepard");

        dogs.set(3,"Bulldog");

        dogs.clear();

        for( int i=0; i< dogs.size(); i++ ) {

            System.out.println(dogs.get(i));

        }

        String[] animals = {"cat","dog","rat","bird"};

        for (String i:animals){

            System.out.println(i);

        }

        

    }
}