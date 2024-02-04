package homeWorks.homeWork14.task2;

public class Task2 {
    public static void main(String[] args) {
        // Класс Task3 содержит метод main
        // Создаем объект класса NumbersArray
        NumbersArray numbersArray = new NumbersArray();

        // Получаем массив нечетных чисел от 1 до 99 с помощью метода createOddNumbersArray
        int[] oddNumbers = numbersArray.createOddNumbersArray();

        // Выводим массив на экран в строку в обратном порядке
        System.out.print("Массив нечетных чисел от 1 до 99 в обратном порядке: ");
        for (int i = oddNumbers.length - 1; i >= 0; i--) {
            System.out.print(oddNumbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }


}



