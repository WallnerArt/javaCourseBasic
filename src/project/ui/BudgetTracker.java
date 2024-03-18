package project.ui;


import project.dto.TransactionDto;
import project.service.TransactionService;

import java.util.Scanner;

public class BudgetTracker {
    private TransactionService transactionService;
    private Scanner scanner;

    public BudgetTracker(TransactionService transactionService) {
        this.transactionService = transactionService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("1. Добавить транзакцию");
            System.out.println("2. Просмотреть все транзакции");
            System.out.println("3. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTransaction();
                    break;
                case 2:
                    viewAllTransactions();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    private void viewAllTransactions() {
    }

    private void addTransaction() {
        System.out.println("Введите сумму: ");
        double amount = scanner.nextDouble();

        System.out.println("Введите категорию: ");
        String category = scanner.next();

        System.out.println("Введите дату: ");
        String date = scanner.next();

        TransactionDto transactionDto = new TransactionDto(amount, category, date);
        transactionService.addTransaction(transactionDto);
    }
}