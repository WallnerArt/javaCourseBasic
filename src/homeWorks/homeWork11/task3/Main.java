package homeWorks.homeWork11.task3;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            //  Создаем объект Scanner для считывания ввода пользователя.
            //  Инициализируем переменную sum для хранения суммы введенных чисел.
            System.out.println("Введите числа. Для окончания введите отрицательное число.");
            //  Запрашиваем у пользователя ввод чисел до тех пор, пока не будет введено отрицательное число.
            while (true) {
                System.out.print("Введите число: ");
                int number = scanner.nextInt();

                if (number < 0) {
                    break; // Выход из цикла, если введено отрицательное число
                    // При каждой итерации цикла считывает число, проверяет его на отрицательность.
                }
                sum += number;
                // В противном случае, число добавляется к переменной sum.
            }

            System.out.println("Сумма введенных положительных чисел: " + sum);
            // После выхода из цикла выводим сумму введенных положительных чисел.
        }
    }


