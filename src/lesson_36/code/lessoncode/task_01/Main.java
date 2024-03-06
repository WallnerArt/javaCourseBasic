package lesson_36.code.lessoncode.task_01;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр класса Box с типами String и Integer
        Box<String, Integer> box1 = new Box<>("Hello", 123);
        System.out.println("Box 1: " + box1.item1 + ", " + box1.item2);

        // Создаем экземпляр класса Box с типами Integer и String
        Box<Integer, String> box2 = new Box<>(456, "World");
        System.out.println("Box 2: " + box2.item1 + ", " + box2.item2);

        // Создаем коллекцию строк
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("MatriX");

        // Создаем экземпляр класса Box с типами Integer и ArrayList<String>
        Box<Integer, ArrayList<String>> box3 = new Box<>(789, arrayList);
        System.out.println("Box 3: " + box3.item1 + ", " + box3.item2);
    }
}


