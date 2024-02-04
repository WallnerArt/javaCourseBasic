package homeWorks.homeWork13.task2;


    import java.util.Arrays;
import java.util.Random;

    public class MainArray {
        public static void main(String[] args) {
            // 1. Создаем массив из 5 случайных целых чисел из интервала [10;99]
            int[] array = createRandomArray(5, 10, 99);

            // 2. Выводим массив на консоль в строку
            System.out.println("Исходный массив: " + Arrays.toString(array));

            // 3. Проверяем, является ли массив строго возрастающей последовательностью
            boolean isIncreasing = true; // Переменная для хранения результата проверки
            for (int i = 1; i < array.length; i++) {
                if (array[i] <= array[i - 1]) { // Если текущий элемент не больше предыдущего
                    isIncreasing = false; // То массив не является строго возрастающей последовательностью
                    break; // Прерываем цикл, так как дальнейшая проверка не имеет смысла
                }
            }

            // 4. Выводим соответствующее сообщение о результате проверки
            if (isIncreasing) {
                System.out.println("Массив является строго возрастающей последовательностью.");
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью.");
            }
        }

        // Метод для создания массива из случайных целых чисел в заданном диапазоне
        public static int[] createRandomArray(int size, int min, int max) {
            int[] array = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(max - min + 1) + min;
            }
            return array;
        }
    }


