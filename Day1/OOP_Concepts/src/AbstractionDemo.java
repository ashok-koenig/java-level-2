abstract class Vehicle{
    String brand = "Generic";
    // Abstract method (no body)
    abstract void start();

    // Concrete method (with body)
    void stop() {
        System.out.println(brand + " vehicle stopped");
    }
}

class Car extends Vehicle{
    Car(String brand){
        this.brand = brand;
    }
    void start() {
        System.out.println(brand + " car started");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
//        Vehicle obj = new Vehicle();
        Vehicle car = new Car("Honda");
        car.start();
        car.stop();
    }
}
