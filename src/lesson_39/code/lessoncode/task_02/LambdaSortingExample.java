package lesson_39.code.lessoncode.task_02;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSortingExample {

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 9};

        // Сортировка массива с помощью лямбда-выражения
        Arrays.sort(numbers, (a, b) -> a.compareTo(b));

        // Вывод отсортированного массива
        for (int number : numbers) {
            System.out.print(number + " "); // Выведет 1 2 5 8 9
        }
    }
}