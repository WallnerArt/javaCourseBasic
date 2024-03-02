package lesson_31.code.lessoncode.task_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");

        replaceStringsWithA(strings);

        System.out.println("Измененный список после замены элементов, содержащих 'a':");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void replaceStringsWithA(List<String> strings) {
        List<String> modifiedStrings = new ArrayList<>();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.contains("a")) {
                modifiedStrings.add("Modified list: "); // Добавляем "" вместо строки с 'a'
            } else {
                modifiedStrings.add(str); // Добавляем оригинальную строку
            }
        }
        // Заменяем исходный список измененным списком
        strings.clear();
        strings.addAll(modifiedStrings);
    }
}



