package Kp_Assignment;

interface Engine {
    void start();
}
interface Transmission {
    void shift();
}
interface Vehicle extends Engine, Transmission {
    void drive();
}
public class Car implements Vehicle {
    public void start() {
        System.out.println("Engine started");
    }
    public void shift() {
        System.out.println("Transmission shifted");
    }
    public void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.shift();
        car.drive();
    }
}

