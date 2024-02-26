package lesson_29.code.lessoncode.homeWork.task_02;

import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class NumericListOperations {

    public static void main(String[] args) {
        // Создаем LinkedList для хранения целых чисел
        LinkedList<Integer> numericList = new LinkedList<>();

        // Добавляем случайные числа в диапазоне от 1 до 100 в список
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numericList.add(randomNumber);
        }

        // Находим и выводим максимальное и минимальное числа
        int maximum = Collections.max(numericList);
        int minimum = Collections.min(numericList);
        System.out.println("Максимальное число: " + maximum);
        System.out.println("Минимальное число: " + minimum);

        // Сортируем список по возрастанию и выводим его
        Collections.sort(numericList);
        System.out.println("Отсортированный список: " + numericList);
    }
}



