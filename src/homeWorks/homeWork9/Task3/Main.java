package homeWorks.homeWork9.Task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7:");
        int number = scanner.nextInt();

        NumberAnalyzer analyzer = new NumberAnalyzer();
        String result = analyzer.analyze(number);

        System.out.println(result);
    }
}






