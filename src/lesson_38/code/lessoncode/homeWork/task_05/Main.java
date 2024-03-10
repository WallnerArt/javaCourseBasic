package lesson_38.code.lessoncode.homeWork.task_05;

public class Main {

    public static void main(String[] args) {
        PrimeChecker checker = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(checker.isPrime(7)); // Выводит "true"
        System.out.println(checker.isPrime(10)); // Выводит "false"
    }
}