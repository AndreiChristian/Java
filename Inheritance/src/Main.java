public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.go();

        Bicycle bicycle = new Bicycle(2);

        bicycle.stop();

        System.out.println(bicycle.wheels);


    }
}