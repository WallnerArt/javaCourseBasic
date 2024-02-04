package homeWorks.homeWork14.task3;

public class ArrayOperations {
    // Метод для подсчета четных элементов в массиве
    public int countEvenElements(int[] array) {
        int evenCount = 0; // Инициализируем счетчик четных элементов
        for (int num : array) { // Проходим по всем элементам массива
            if (num % 2 == 0) { // Если текущий элемент четный
                evenCount++; // Увеличиваем счетчик четных элементов
            }
        }
        return evenCount; // Возвращаем количество четных элементов
    }

    // Метод для вывода массива на экран
    public void printArray(int[] array) {
        for (int num : array) { // Проходим по всем элементам массива
            System.out.print(num + " "); // Выводим элемент на экран
        }
        System.out.println(); // Переходим на новую строку
    }
}



