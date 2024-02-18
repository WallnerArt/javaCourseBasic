package lesson_21.code.lessoncode.homeWork_21.task_05;
public class Bicycle extends Vehicle {
    // Дополнительное свойство для велосипеда
    private int numberOfGears;

    // Конструктор для инициализации свойств велосипеда
    public Bicycle(String brand, String model, int numberOfGears) {
        super(brand, model);
        this.numberOfGears = numberOfGears;
    }

    // Метод для получения информации о велосипеде
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Number of gears: " + numberOfGears);
    }
}
