package lesson_34.code.lessoncode.homeWork.task_02;


import java.util.LinkedList;

public class MyCollection<E> {
    private LinkedList<E> collection;

    public MyCollection() {
        collection = new LinkedList<>();
    }

    // Добавление элемента в конец коллекции
    public void add(E element) {
        collection.addLast(element);
    }

    // Вставка элемента по указанному индексу
    public void add(int index, E element) {
        collection.add(index, element);
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return collection.toString();
    }

    // Остальные методы моей коллекции...

    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<>();

        myCollection.add("Элемент 1");
        myCollection.add("Элемент 2");
        myCollection.add("Элемент 3");

        System.out.println(myCollection); // Вывод: [Элемент 1, Элемент 2, Элемент 3]

        myCollection.add(1, "Новый элемент");

        System.out.println(myCollection); // Вывод: [Элемент 1, Новый элемент, Элемент 2, Элемент 3]
    }
}