public class Bicycle extends Vehicle {

    int wheels = 2;

    public Bicycle(int wheels) {
        this.wheels = wheels;
    }

    @Override
    void stop() {
       System.out.println("This bike has stopped");
    }
}
