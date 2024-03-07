package lesson_38.code.lessoncode.task_01;
// Создаем класс Car
public class Car {

    private int numOfDoors; // Количество дверей

    // Конструктор класса Car
    public Car(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    // Внутренний класс Door
    public class Door {

        private double length; // Длина двери
        private double height; // Высота двери
        private boolean isOpen; // Состояние двери (открыта или закрыта)

        // Конструктор внутреннего класса Door
        public Door(double length, double height) {
            this.length = length;
            this.height = height;
            this.isOpen = false; // По умолчанию дверь закрыта
        }

        // Метод для открытия двери
        public void open() {
            isOpen = true;
            System.out.println("Дверь открыта");
        }

        // Метод для закрытия двери
        public void close() {
            isOpen = false;
            System.out.println("Дверь закрыта");
        }
    }
}