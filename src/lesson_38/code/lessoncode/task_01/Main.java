package lesson_38.code.lessoncode.task_01;

public class Main {

    public static void main(String[] args) {
        // Создаем объект Car
        Car car = new Car(4); // Создаем автомобиль с четырьмя дверьми
        // Создаем объекты дверей
        Car.Door frontLeftDoor = car.new Door(1.2, 1.8); // Создаем левую переднюю дверь
        Car.Door frontRightDoor = car.new Door(1.2, 1.8); // Создаем правую переднюю дверь
        Car.Door rearLeftDoor = car.new Door(1.2, 1.8); // Создаем левую заднюю дверь
        Car.Door rearRightDoor = car.new Door(1.2, 1.8); // Создаем правую заднюю дверь

        // Открываем и закрываем двери
        frontLeftDoor.open();
        frontRightDoor.open();
        rearLeftDoor.close();
        rearRightDoor.close();
    }
}
