package corp.kahuna;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Dave's Car");
        Car anotherCar = new Car("Batmobile");

        myCar.accelerate(5);
        myCar.accelerate(30);
        myCar.brake(4);

        anotherCar.brake(5);
    }
}

class Car {

    private int speed = 0;  // Can't use var to declare a field
    private String name;    // Field definition

    public Car(String carName) {          // Constructor - BASIC example. Java will create if not specified
        name = carName;
    }

    public void accelerate(int amount) {             // Public so that it's available outside of the Class (Car())
        speed += amount;
        showSpeed();
    }

    public void brake(int amount) {                    // Method
        speed = (speed < amount) ? 0 : speed - amount;    // Java Ternary BOOLEAN ? TRUE : FALSE;
        showSpeed();
    }

    private void showSpeed() {              // Only used in Car Class
        System.out.printf("%s is going %d miles per hour %n", name, speed);
    }
}
