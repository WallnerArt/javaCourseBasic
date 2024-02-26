package homeWorks.homeWork_21.task_05;
public class Vehicle {
    // Общие свойства транспортного средства
    protected String brand;
    protected String model;

    // Конструктор для инициализации свойств
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Метод для получения информации о транспортном средстве
    public void getInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}


