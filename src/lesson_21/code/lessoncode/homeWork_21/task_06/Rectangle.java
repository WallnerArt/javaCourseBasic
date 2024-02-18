package lesson_21.code.lessoncode.homeWork_21.task_06;

public class Rectangle extends Shape {
    // Длина и ширина прямоугольника
    private double length;
    private double width;

    // Конструктор для инициализации длины и ширины прямоугольника
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Реализация метода для вычисления площади прямоугольника
    @Override
    public double calculateArea() {
        return length * width;
    }
}
