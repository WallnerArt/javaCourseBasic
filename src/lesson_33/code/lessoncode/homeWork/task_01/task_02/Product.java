package lesson_33.code.lessoncode.homeWork.task_01.task_02;

class Product {
    private String name;
    private double price;

    // Конструктор для создания объекта продукта
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры для получения имени и цены продукта
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


