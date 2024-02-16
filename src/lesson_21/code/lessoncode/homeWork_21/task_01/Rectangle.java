package lesson_21.code.lessoncode.homeWork_21.task_01;

// Класс для прямоугольника
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String title, double width, double height) {
        super(title);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}


