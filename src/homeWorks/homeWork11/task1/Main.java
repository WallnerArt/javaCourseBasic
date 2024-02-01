package homeWorks.homeWork11.task1;

import java.util.Scanner;

// Главный класс Main для запуска программы
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int result = SumCalculator.calculateSumOfEvenNumbers(N); // Вызываем метод для вычисления суммы четных чисел

        System.out.println("Сумма всех четных чисел от 0 до " + N + " равна " + result);
    }

}
