package homeWorks.homework19.Task03;

import java.util.Arrays;
import java.util.Random;

public class ArraySorter {

    public static void main(String[] args) {
        int[] array = generateRandomArray(8, 1, 10);

        System.out.println("Исходный массив:");
        printArray(array);

        sortArrayDescending(array);

        System.out.println("Массив после сортировки по убыванию:");
        printArray(array);
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

    // Метод для сортировки массива по убыванию
    public static void sortArrayDescending(int[] array) {
        Arrays.sort(array);
        reverseArray(array);
    }

    // Метод для обращения порядка элементов массива
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    // Метод для вывода элементов массива на экран
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

