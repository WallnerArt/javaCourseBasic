package homeWorks.homeWork8;

import java.util.Scanner;

public class ScannerUserInput {
    public static void main(String[] args) {
        // Вводим данные с клавиатуры с помощью Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        scanner.close();
    }
}

