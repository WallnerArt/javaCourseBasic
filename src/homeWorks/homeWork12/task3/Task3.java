package homeWorks.homeWork12.task3;

import java.util.Scanner;
    public class Task3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрашиваем у пользователя ввод числа, для которого нужно вычислить факториал
            System.out.print("Введите число для вычисления факториала: ");
            int number = scanner.nextInt();

            // Вызываем метод для вычисления факториала и выводим результат
            long factorialResult = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен: " + factorialResult);
        }

        // Метод для вычисления факториала числа
        public static long calculateFactorial(int n) {
            // Проверка на случай, если пользователь ввел отрицательное число
            if (n < 0) {
                throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
            }

            // Инициализация переменной для хранения результата факториала
            long factorial = 1;

            // Вычисление факториала числа
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            return factorial;
        }
    }


