package lesson6.code.car;

import lesson6.code.car.Car;
public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Mercedes");

        car.model = "GLC 250";
        car.color = "Black";

        System.out.println(car.getProducer());

    }
}


