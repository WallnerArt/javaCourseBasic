package homeWorks.homeWork14.task3;

    import java.util.Random;
    import java.util.Random;

public class ArrayHelper {
    // Метод для создания массива из случайных целых чисел в заданном диапазоне
    public int[] createRandomArray(int size, int min, int max) {
        int[] array = new int[size]; // Создаем новый массив заданного размера
        Random random = new Random(); // Создаем объект Random для генерации случайных чисел
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Генерируем случайное число и добавляем его в массив
        }
        return array; // Возвращаем созданный массив
    }

    public void printArray(int[] array) {
    }

    public int countEvenElements(int[] array) {
        return 0;
    }


}