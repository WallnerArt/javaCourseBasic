package homeWorks.homeWork14.task2;

public class NumbersArray {
         // Класс NumbersArray содержит метод createOddNumbersArray
        // Метод для создания массива из всех нечетных чисел от 1 до 99
        public int[] createOddNumbersArray() {
            int[] oddNumbers = new int[50]; // В массиве будет 50 элементов, так как нечетных чисел в диапазоне от 1 до 99 - 50 штук
            int num = 99; // Начинаем с последнего нечетного числа
            for (int i = 0; i < oddNumbers.length; i++) {
                oddNumbers[i] = num;
                num -= 2; // Переходим к предыдущему нечетному числу
            }
            return oddNumbers;
        }
}
