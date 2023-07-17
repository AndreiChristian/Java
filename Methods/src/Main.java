import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        hello();

        helloName("Peanut");
        helloName("Sane");
        helloName("Andrei");

        final ArrayList<String> animals = new ArrayList<String>();

        animals.add("Dog");
        animals.add("Dog");
        animals.add("Dog");

        final String[] cars = {"Audi", "BMW", "Mercedes"};

        cars[1] = "Dacia";

    }

    static void hello() {
        System.out.println("Hello");
    }

    static void helloName(String arg) {

        System.out.println("Hello " + arg);
    }


}
