package homeWorks.homeWork13.task1;

    import java.util.Random;
    public class TaskArray {
        public static void main(String[] args) {
            // 1. Создаем массив из 8 случайных целых чисел из интервала [1;50]
            int[] array = createRandomArray(8, 1, 50);

            // 2. Выводим массив на консоль в строку
            System.out.print("Исходный массив: ");
            printArray(array);

            // 3. Заменяем каждый элемент с нечетным индексом на ноль
            replaceOddIndicesWithZero(array);

            // 4. Снова выводим массив на консоль в отдельной строке
            System.out.print("\nМассив после замены нечетных индексов на ноль: ");
            printArray(array);
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

        // Метод для вывода массива на консоль в строку
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
        }

        // Метод для замены каждого элемента с нечетным индексом на ноль
        public static void replaceOddIndicesWithZero(int[] array) {
            for (int i = 1; i < array.length; i += 2) {
                array[i] = 0;
            }
        }
    }


