package lesson_34.code.lessoncode.homeWork.task_03;

import java.util.Arrays;

public class MyCollection<E> {
    private Object[] collection;
    private int size;

    public MyCollection() {
        collection = new Object[10];
        size = 0;
    }

    // Добавление элемента в коллекцию
    public void add(E element) {
        // Проверяем, достаточно ли места в массиве
        if (size == collection.length) {
            // Увеличиваем размер массива вдвое
            Object[] newArray = new Object[collection.length * 2];
            System.arraycopy(collection, 0, newArray, 0, size);
            collection = newArray;
        }
        // Добавляем элемент в конец массива
        collection[size] = element;
        size++;
    }

    // Удаление элемента по индексу
    public void remove(int index) {
        // Проверяем, является ли индекс корректным
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Некорректный индекс");
        }
        // Сдвигаем элементы влево, начиная с указанного индекса
        for (int i = index; i < size - 1; i++) {
            collection[i] = collection[i + 1];
        }
        // Удаляем последний элемент и уменьшаем размер коллекции
        collection[size - 1] = null;
        size--;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(collection, size));
    }

    // Остальные методы вашей коллекции...

    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<>();

        myCollection.add("Элемент 1");
        myCollection.add("Элемент 2");
        myCollection.add("Элемент 3");

        System.out.println(myCollection); // Вывод: [Элемент 1, Элемент 2, Элемент 3]

        myCollection.remove(1);

        System.out.println(myCollection); // Вывод: [Элемент 1, Элемент 3]
    }
}