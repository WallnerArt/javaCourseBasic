package homeWorks.homeWork14.task3;

public class Task3 {
        public static void main(String[] args) {
            // Создаем объект класса ArrayHelper
            ArrayHelper arrayHelper;
            arrayHelper = new ArrayHelper();

            // Создаем массив из 15 случайных целых чисел из отрезка [0;9]
            int[] array = arrayHelper.createRandomArray(15, 0, 9);

            // Выводим массив на экран
            System.out.print("Массив: ");
            arrayHelper.printArray(array);

            // Подсчитываем количество четных элементов в массиве
            int evenCount = arrayHelper.countEvenElements(array);

            // Выводим количество четных элементов на экран
            System.out.println("Количество четных элементов в массиве: " + evenCount);
        }
    }


