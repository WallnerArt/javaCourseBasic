package lesson_29.code.lessoncode.homeWork.task_03;

import java.util.HashMap;
import java.util.Scanner;

public class TranslationDictionary {
    public static void main(String[] args) {
        // Создание HashMap для словаря перевода слов
        HashMap<String, String> dictionary = new HashMap<>();

        // Добавление пяти пар слов в словарь
        dictionary.put("apple", "яблоко");
        dictionary.put("book", "книга");
        dictionary.put("cat", "кошка");
        dictionary.put("dog", "собака");
        dictionary.put("elephant", "слон");

        // Ввод слова от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word in English: ");
        String word = scanner.nextLine();

        // Вывод перевода слова
        if (dictionary.containsKey(word)) {
            String translation = dictionary.get(word);
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Translation not found for the given word.");
        }

        // Удаление слова из словаря и вывод обновленного списка слов
        dictionary.remove(word);
        System.out.println("Updated word list:");
        for (String englishWord : dictionary.keySet()) {
            String russianWord = dictionary.get(englishWord);
            System.out.println(englishWord + " : " + russianWord);
        }
    }
}

