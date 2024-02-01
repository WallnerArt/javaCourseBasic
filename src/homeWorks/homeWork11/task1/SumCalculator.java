package homeWorks.homeWork11.task1;

public class SumCalculator {
    // Метод для вычисления суммы всех четных чисел от 0 до N
    public static int calculateSumOfEvenNumbers(int N) {
        int sum = 0;
        for (int i = 0; i <= N; i += 2) { // Итерируемся от 0 до N с шагом 2
            sum += i; // Прибавляем текущее четное число к сумме
        }
        return sum; // Возвращаем сумму
    }
}
