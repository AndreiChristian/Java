public class Car {

    String make = "Chevrolet";
    String model = "Corvette";
    Integer year = 2020;
    String color = "blue";
    double price = 500.00;

    void drive(){

        System.out.println("Vrumm");

    }

    void brake(){
        System.out.println("Skrrrr");
    }

    public Car(String make, String model, Integer year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
}
