package homeWorks.homeWork9.Task3;
public class Main {
        public static void main(String[] args) {
            // Генерация случайных чисел
            int[] randomNumbers = new int[4];
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = RandomNumberGenerator.generateRandomNumber();
            }

            // Вывод сгенерированных чисел на экран
            System.out.println("Сгенерированные числа:");
            for (int number : randomNumbers) {
                System.out.println(number);
            }

            // Определение максимального числа и вывод на экран
            int maxNumber = NumberAnalyzer.findMax(randomNumbers);
            System.out.println("Максимальное число: " + maxNumber);
        }
    }


