package homeWorks.homeWork7;

import java.util.Scanner;

    public class HomeWork072 {
        public static void main(String[] args) {
            // Создаем объект Scanner для ввода данных с консоли
            Scanner scanner = new Scanner(System.in);

            // Запрашиваем у пользователя ввод двух слов
            System.out.print("Введите первое слово: ");
            String firstWord = scanner.next();

            System.out.print("Введите второе слово: ");
            String secondWord = scanner.next();

            // Закрываем Scanner, так как ввод данных завершен
            scanner.close();

            // Получаем первую половину первого слова
            String firstHalf = firstWord.substring(0, (firstWord.length() + 1) / 2);

            // Получаем вторую половину второго слова
            String secondHalf = secondWord.substring((secondWord.length() + 1) / 2);

            // Соединяем половины слов
            String result = firstHalf + secondHalf;

            // Выводим результат на консоль
            System.out.println("Результат: " + result);
        }
    }


