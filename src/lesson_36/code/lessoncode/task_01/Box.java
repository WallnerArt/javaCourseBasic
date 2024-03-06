package lesson_36.code.lessoncode.task_01;

import java.util.ArrayList;

// Создаем класс Box с двумя переменными
class Box<T, E> {
    T item1;
    E item2;

    // Конструктор класса Box
    public Box(T item1, E item2) {
        this.item1 = item1;
        this.item2 = item2;
    }
}


