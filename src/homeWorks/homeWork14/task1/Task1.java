package homeWorks.homeWork14.task1;

public class Task1 {
        public static void main(String[] args) {
            // Входной массив
            int[] arr1 = {1, 2, 3, 5};
            int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

            // Выводим недостающий элемент для каждого массива
            System.out.println("Недостающий элемент для arr1: " + findMissingElement(arr1));
            System.out.println("Недостающий элемент для arr2: " + findMissingElement(arr2));
        }

        // Метод для нахождения недостающего элемента в массиве
        public static int findMissingElement(int[] arr) {
            // Вычисляем сумму всех чисел от 1 до n
            int n = arr.length + 1; // Длина массива должна быть на 1 больше
            int totalSum = n * (n + 1) / 2;

            // Вычисляем сумму элементов массива
            int arraySum = 0;
            for (int num : arr) {
                arraySum += num;
            }

            // Находим недостающий элемент
            return totalSum - arraySum;
        }
    }


