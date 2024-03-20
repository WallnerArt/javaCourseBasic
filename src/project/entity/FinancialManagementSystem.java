package project.entity;

import project.entity.Transaction;

import java.util.Scanner;

public class FinancialManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму транзакции: ");
        double amount = scanner.nextDouble();

        System.out.print("Введите категорию транзакции: ");
        String category = scanner.next();

        System.out.print("Введите дату транзакции (гггг-мм-дд): ");
        String date = scanner.next();

        if (isValidData(amount, category, date)) {
            Transaction transaction = new Transaction(amount, category, date);

            System.out.println("Создана новая транзакция:");
            System.out.println("Сумма: " + transaction.getAmount());
            System.out.println("Категория: " + transaction.getCategory());
            System.out.println("Дата: " + transaction.getDate());
        } else {
            System.out.println("Вы ввели неверные данные. Пожалуйста, проверьте введенные значения.");
        }
    }

    private static boolean isValidData(double amount, String category, String date) {
        // Проверка правильности суммы
        if (amount <= 0) {
            return false;
        }

        // Проверка правильности категории
        if (category.isEmpty()) {
            return false;
        }

        // Проверка правильности даты
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }

        return true;
    }
}