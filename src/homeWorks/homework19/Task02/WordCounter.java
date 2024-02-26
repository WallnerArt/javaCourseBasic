package homeWorks.homework19.Task02;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        System.out.println("Введите предложение:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        int wordCount = countWords(sentence);

        System.out.println("Количество слов: " + wordCount);
    }

    // Метод для подсчета количества слов в предложении
    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}

