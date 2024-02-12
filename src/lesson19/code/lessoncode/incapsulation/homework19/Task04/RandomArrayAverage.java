package lesson19.code.lessoncode.incapsulation.homework19.Task04;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayAverage {

    public static void main(String[] args) {
        int[] array1 = generateRandomArray(5, 0, 5);
        int[] array2 = generateRandomArray(5, 0, 5);

        System.out.println("Первый массив:");
        printArray(array1);

        System.out.println("Второй массив:");
        printArray(array2);

        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        System.out.println("Среднее арифметическое первого массива: " + average1);
        System.out.println("Среднее арифметическое второго массива: " + average2);

        if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое второго массива больше");
        } else {
            System.out.println("Средние арифметические равны");
        }
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
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

    // Метод для подсчета среднего арифметического элементов массива
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }
}
