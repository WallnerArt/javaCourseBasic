package lesson_32.code.lessoncode.task_03;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeChecker {
    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String text) {
        // <span style="color:green">Удаляем из строки все символы, кроме букв и приводим ее к нижнему регистру</span>
        String cleanedText = text.replaceAll("[^а-яА-Я]", "").toLowerCase();

        // Создаем двустороннюю очередь для хранения символов строки
        Deque<Character> deque = new LinkedList<>();

        // Добавляем все символы строки в очередь
        for (int i = 0; i < cleanedText.length(); i++) {
            deque.addLast(cleanedText.charAt(i));
        }

        // Проверяем, является ли строка палиндромом
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        // Если все символы совпадают, то строка является палиндромом
        return true;
    }

    public static void main(String[] args) {
        // Примеры строк для проверки на палиндром
        String[] testStrings = {
                "А роза упала на лапу Азора!",
                "довод",
                "казак",
                "ротор",
                "банкир"
        };

        // Проверяем каждую строку и выводим результат
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" является палиндромом: " + isPalindrome(str));
        }
    }
}


