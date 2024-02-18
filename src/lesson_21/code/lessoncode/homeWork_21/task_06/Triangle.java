package lesson_21.code.lessoncode.homeWork_21.task_06;

public class Triangle extends Shape {
    // Основание и высота треугольника
    private double base;
    private double height;

    // Конструктор для инициализации основания и высоты треугольника
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Реализация метода для вычисления площади треугольника
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
