package projectFC401.ui;

import lesson_37.code.lessoncode.practice.UserRepository;
import projectFC401.entity.Transaction;
import projectFC401.repository.TransactionRepository;
import projectFC401.service.ServiceAddOrUpdate;
import projectFC401.service.ServiceCalculatorBalance;
import projectFC401.service.ServiceFind;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final ServiceFind serviceFind;
    private final ServiceCalculatorBalance serviceCalculateBalance;

    public UserInterface(ServiceAddOrUpdate serviceAddOrUpdate, ServiceFind serviceFind, ServiceCalculatorBalance serviceCalculateBalance) {
        this.serviceFind = serviceFind;
        this.serviceCalculateBalance = serviceCalculateBalance;
    }

    public void showMenu() {
        System.out.println("1. Добавить доход");
        System.out.println("2. Добавить расход");
        System.out.println("3. Посмотреть все транзакции");
        System.out.println("4. Посмотреть баланс за период");
        System.out.println("0. Выйти");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Добавить доход
                break;
            case 2:
                // Добавить расход
                break;
            case 3:
                // Посмотреть все транзакции
                List<Transaction> transactions = serviceFind.findAll();
                for (Transaction transaction : transactions) {
                    System.out.println(transaction);
                }
                break;
            case 4:
                // Посмотреть баланс за период
                System.out.println("Введите начальную дату (YYYY-MM-DD): ");
                String startDate = scanner.nextLine();
                System.out.println("Введите конечную дату (YYYY-MM-DD): ");
                String endDate = scanner.nextLine();
                Double balance = serviceCalculateBalance.calculateBalance(1L, startDate, endDate);
                System.out.println("Баланс за период: " + balance);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Неверный выбор");
        }
    }

    public static void main(String[] args) {
        ServiceAddOrUpdate serviceAddOrUpdate;
        serviceAddOrUpdate = new ServiceAddOrUpdate(TransactionRepository.createTransactionRepository(), new UserRepository());
        ServiceFind serviceFind = new ServiceFind(TransactionRepository.createTransactionRepository());
        ServiceCalculatorBalance serviceCalculateBalance = new ServiceCalculatorBalance(TransactionRepository.createTransactionRepository());
        UserInterface userInterface = new UserInterface(serviceAddOrUpdate, serviceFind, serviceCalculateBalance);

        while (true) {
            userInterface.showMenu();
        }
    }
}