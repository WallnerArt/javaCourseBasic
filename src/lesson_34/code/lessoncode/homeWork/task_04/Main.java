package lesson_34.code.lessoncode.homeWork.task_04;

public class Main {

    public static void main(String[] args) {
        MyCollection<Integer> collection = new MyCollection<>();

        collection.add(10);
        collection.add(20);
        collection.add(30);

        System.out.println("Размер коллекции: " + collection.size()); // Выводим размер коллекции

        collection.add(1, 15); // Вставляем элемент 15 по индексу 1

        System.out.println("Размер коллекции: " + collection.size()); // Выводим новый размер коллекции

        collection.remove(2); // Удаляем элемент по индексу 2

        System.out.println("Размер коллекции: " + collection.size()); // Выводим новый размер коллекции
    }
}