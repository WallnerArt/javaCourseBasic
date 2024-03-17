package lesson_42.code.lessoncode.code.homeWork.task_01;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        try {
            double result = divideNumbers(num1, num2);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль недопустимо.");
        }
    }

    public static double divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return (double) num1 / num2;
    }
}