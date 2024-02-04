package homeWorks.homeWork12.task2;

    import java.util.Scanner;
    public class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0; // Переменная для хранения суммы введенных чисел
            int count = 0; // Переменная для хранения количества введенных чисел

            // Запрашиваем у пользователя ввод чисел
            System.out.println("Введите числа. Для окончания введите 0.");

            while (true) {
                System.out.print("Введите число: ");
                int number = scanner.nextInt();

                if (number == 0) {
                    break; // Выход из цикла при вводе 0
                }

                sum += number; // Увеличиваем сумму на введенное число
                count++; // Увеличиваем счетчик количества введенных чисел
            }

            if (count > 0) {
                double average = (double) sum / count; // Вычисляем среднее арифметическое
                System.out.println("Сумма введенных чисел: " + sum);
                System.out.println("Среднее арифметическое введенных чисел: " + average);
            } else {
                System.out.println("Вы не ввели ни одного числа.");
            }
        }
    }



