package lesson_42.code.lessoncode.code.homeWork.task_05;
import java.util.Scanner;

public class CustomExceptionWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = getNumberFromUser(scanner);
            System.out.println("Введенное число: " + number);
        } catch (NegativeNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int getNumberFromUser(Scanner scanner) throws NegativeNumberException {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new NegativeNumberException("Введено отрицательное число.");
        }

        return number;
    }
}