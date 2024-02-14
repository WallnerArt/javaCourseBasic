package lesson_19.code.lessoncode.incapsulation.homework19.Task05;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        int n = getArraySizeFromUser();

        int[] array = generateRandomArray(n);

        System.out.println("Сгенерированный массив:");
        printArray(array);

        EvenNumbers.filterEvenNumbers(array);
    }

    // Метод для получения размера массива от пользователя
    public static int getArraySizeFromUser() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введите размер массива (натуральное число больше 3): ");
            n = scanner.nextInt();
        } while (n <= 3);

        return n;
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (size + 1));
        }

        return array;
    }

    // Метод для вывода элементов массива на экран
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
