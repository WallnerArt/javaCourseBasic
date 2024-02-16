package lesson_21.code.lessoncode.homeWork_21.task_01;

import java.util.Random;

// Создаем абстрактный класс Shape
abstract class Shape {
    protected String title;

    public Shape(String title) {
        this.title = title;
    }

    // Абстрактные методы для вычисления площади и периметра, которые будут реализованы в дочерних классах
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}


