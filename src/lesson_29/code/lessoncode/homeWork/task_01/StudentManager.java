package lesson_29.code.lessoncode.homeWork.task_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    public static void main(String[] args) {
        // Создаем ArrayList для хранения имен студентов
        List<String> studentList = new ArrayList<>();

        // Добавляем пять имен студентов в список
        studentList.add("Алексей");
        studentList.add("Мария");
        studentList.add("Иван");
        studentList.add("Екатерина");
        studentList.add("Дмитрий");

        // Выводим список студентов в обратном порядке
        System.out.println("Список студентов в обратном порядке:");
        Collections.reverse(studentList);
        for (String student : studentList) {
            System.out.println(student);
        }

        // Удаляем студента из списка по индексу
        int indexToRemove = 2; // Удалим третьего студента (индекс 2)
        if (indexToRemove >= 0 && indexToRemove < studentList.size()) {
            studentList.remove(indexToRemove);
        }

        // Выводим обновленный список студентов
        System.out.println("\nОбновленный список студентов:");
        for (String student : studentList) {
            System.out.println(student);

            //Первоначально создается ArrayList с именами студентов. Затем пять имен добавляются в список.
            //После этого список студентов выводится в обратном порядке с помощью метода Collections.reverse().
            //Далее, студент с заданным индексом удаляется из списка с помощью метода remove().
            //В конце выводится обновленный список студентов.
        }
    }
}

