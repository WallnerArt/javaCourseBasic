package lesson6;

import java.util.Scanner;

public class HomeWork062 {

    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Введите 2 слова, используя сканер
        System.out.println("Введите первое слово:");
        String word1 = scanner.next();

        System.out.println("Введите второе слово:");
        String word2 = scanner.next();

        // Получить слово, состоящее из первой половины первого слова
        // и второй половины второго слова
        String resultWord = combineWords(word1, word2);

        // Распечатать на консоль
        System.out.println("Результат: " + resultWord);

        // Закрываем сканер, чтобы избежать утечек ресурсов
        scanner.close();
    }

    // Метод для объединения слов
    public static String combineWords(String firstWord, String secondWord) {
        // Получить длины слов
        int length1 = firstWord.length();
        int length2 = secondWord.length();

        // Вычислить половины слов
        int half1 = length1 / 2;
        int half2 = length2 / 2;

        // Если количество букв в слове - нечетное, не учитываем среднюю букву
        if (length1 % 2 != 0) {
            half1++;
        }

        if (length2 % 2 != 0) {
            half2++;
        }

        // Составляем новое слово
        String resultWord = firstWord.substring(0, half1) + secondWord.substring(half2);

        return resultWord;
    }
}





