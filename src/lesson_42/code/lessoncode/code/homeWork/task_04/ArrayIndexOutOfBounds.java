package lesson_42.code.lessoncode.code.homeWork.task_04;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Заполнение массива случайными числами
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.print("Введите индекс: ");
        int index = scanner.nextInt();

        try {
            int value = array[index];
            System.out.println("Значение элемента по индексу " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне границ массива.");
        }
    }
}