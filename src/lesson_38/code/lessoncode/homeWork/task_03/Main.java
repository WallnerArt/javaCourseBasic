package lesson_38.code.lessoncode.homeWork.task_03;

public class Main {

    public static void main(String[] args) {
        PalindromeChecker checker = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        };
        System.out.println(checker.isPalindrome("level")); // Выводит "true"
        System.out.println(checker.isPalindrome("hello")); // Выводит "false"
    }
}