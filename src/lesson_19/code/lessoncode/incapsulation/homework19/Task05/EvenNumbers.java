package lesson_19.code.lessoncode.incapsulation.homework19.Task05;

import java.util.Arrays;

public class EvenNumbers {
    public static void filterEvenNumbers(int[] array) {
        int[] evenArray = Arrays.stream(array)
                .filter(number -> number % 2 == 0)
                .toArray();

        System.out.println("Массив из четных элементов первого массива:");
        printArray(evenArray);
    }

    // Метод для вывода элементов массива на экран
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
