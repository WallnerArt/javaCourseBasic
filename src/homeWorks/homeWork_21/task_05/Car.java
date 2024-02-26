package homeWorks.homeWork_21.task_05;

public class Car extends Vehicle {
    // Дополнительное свойство для автомобиля
    private int numberOfDoors;

    // Конструктор для инициализации свойств автомобиля
    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    // Метод для получения информации о машине
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
