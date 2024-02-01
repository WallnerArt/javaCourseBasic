package homeWorks.homeWork11.task2;

import java.util.Scanner;

public class SumCalculator {
    // Метод для суммирования всех чисел, введенных пользователем, до первого отрицательного
    public static int sumUntilNegative() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) { // Запускаем бесконечный цикл
            System.out.print("Введите число (для завершения введите отрицательное число): ");
            int number = scanner.nextInt();

            if (number < 0) { // Проверяем, является ли число отрицательным
                break; // Если число отрицательное, выходим из цикла
            }

            sum += number; // Прибавляем число к сумме
        }

        return sum; // Возвращаем сумму
    }
}
