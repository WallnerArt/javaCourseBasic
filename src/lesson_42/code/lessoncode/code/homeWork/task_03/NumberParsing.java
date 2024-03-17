package lesson_42.code.lessoncode.code.homeWork.task_03;

import java.util.Scanner;

public class NumberParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Преобразованное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенная строка не может быть преобразована в число.");
        }
    }
}