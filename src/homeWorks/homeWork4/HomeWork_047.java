package homeWorks.homeWork4;

public class HomeWork_047 {


    // Метод для вычисления среднего арифметического массива чисел
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("Невозможно вычислить среднее арифметическое для пустого массива.");
            return 0; // Возвращаем 0 в случае пустого массива
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }
}

