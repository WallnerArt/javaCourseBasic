package lesson_34.code.lessoncode.homeWork.task_01;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр коллекции
        MyCollection<Integer> collection = new MyCollection<>();

        // Добавляем элементы в коллекцию
        collection.add(1);
        collection.add(2);
        collection.add(3);

        // Выводим элементы коллекции
        System.out.println("Elements in the collection:");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }

        // Вставляем элемент по индексу 1
        collection.add(1, 4);

        // Выводим элементы после вставки
        System.out.println("\nElements in the collection after insertion:");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }

        // Удаляем элемент с индексом 2
        collection.remove(2);

        // Выводим элементы после удаления
        System.out.println("\nElements in the collection after removal:");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }
}
