package lesson_21.code.lessoncode.homeWork_21.task_06;

public class Circle extends Shape {
    // Радиус круга
    private double radius;

    // Конструктор для инициализации радиуса круга
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода для вычисления площади круга
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
