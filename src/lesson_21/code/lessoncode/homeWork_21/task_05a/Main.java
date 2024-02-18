package lesson_21.code.lessoncode.homeWork_21.task_05a;

class Main {
    public static void main(String[] args) {
        // Создаем объекты автомобиля и велосипеда
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // Используем общие свойства и методы
        car.speed = 60;
        car.color = "Красный";
        car.move();

        bicycle.speed = 20;
        bicycle.color = "Синий";
        bicycle.move();

        // Используем специфические свойства и методы
        car.numberOfDoors = 4;
        car.honk();

        bicycle.numberOfWheels = 2;
        bicycle.ringBell();
    }
}
