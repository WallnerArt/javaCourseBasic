package homeWorks.homeWork_21.task_01;

import java.util.Random;

// Сервисный класс для создания фигур
class ShapeService {
    private Random random = new Random();

    // Метод для создания массива фигур с рандомным размером
    public Shape[] createRandomShapesArray(int minSize, int maxSize) {
        int size = random.nextInt(maxSize - minSize + 1) + minSize;
        return new Shape[size];
    }

    // Метод для наполнения массива рандомными фигурами
    public void fillRandomShapesArray(Shape[] shapes, double min, double max) {
        for (int i = 0; i < shapes.length; i++) {
            int choice = random.nextInt(3); // Генерируем случайное число для выбора типа фигуры
            switch (choice) {
                case 0:
                    shapes[i] = createRandomCircle(min, max);
                    break;
                case 1:
                    shapes[i] = createRandomRectangle(min, max);
                    break;
                case 2:
                    shapes[i] = createRandomTriangle(min, max);
                    break;
            }
        }
    }

    // Вспомогательный метод для создания случайного круга
    private Circle createRandomCircle(double min, double max) {
        double radius = min + (max - min) * random.nextDouble();
        return new Circle("Circle", radius);
    }

    // Вспомогательный метод для создания случайного прямоугольника
    private Rectangle createRandomRectangle(double min, double max) {
        double width = min + (max - min) * random.nextDouble();
        double height = min + (max - min) * random.nextDouble();
        return new Rectangle("Rectangle", width, height);
    }

    // Вспомогательный метод для создания случайного треугольника
    private Triangle createRandomTriangle(double min, double max) {
        double side1 = min + (max - min) * random.nextDouble();
        double side2 = min + (max - min) * random.nextDouble();
        double side3 = min + (max - min) * random.nextDouble();
        return new Triangle("Triangle", side1, side2, side3);
    }

    // Метод для вывода информации о каждой фигуре и ее площади и периметре
    public void printShapeInfo(Shape shape) {
        System.out.println("Title: " + shape.title);
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }

    // Метод для подсчета и вывода площади и периметра для всех фигур
    public void printTotalInfo(Shape[] shapes) {
        double totalArea = 0;
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
            printShapeInfo(shape);
        }
        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}


