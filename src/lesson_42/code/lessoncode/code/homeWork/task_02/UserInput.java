package lesson_42.code.lessoncode.code.homeWork.task_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введите возраст: ");
                age = scanner.nextInt();

                if (age < 0) {
                    throw new IllegalArgumentException();
                }

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: некорректный ввод. Возраст должен быть целым числом.");
                scanner.nextLine(); // Очищаем буфер после некорректного ввода
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: некорректный возраст. Возраст должен быть положительным числом.");
            }
        }

        System.out.println("Возраст: " + age);
    }
}