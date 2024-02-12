package lesson19.code.lessoncode.incapsulation.homework19.Task01;

public class ArrayReverse {

        public static void main(String[] args) {
            String[] array = {"Привет", "Мир", "Java"};

            System.out.println("Исходный массив:");
            printArray(array);

            reverseArray(array);

            System.out.println("Массив после обращения:");
            printArray(array);
        }

        // Метод для обращения порядка элементов массива
        public static void reverseArray(String[] array) {
            int left = 0;
            int right = array.length - 1;

            while (left < right) {
                // Меняем местами элементы с левой и правой сторон
                String temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }

        // Метод для вывода элементов массива на экран
        public static void printArray(String[] array) {
            for (String element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

