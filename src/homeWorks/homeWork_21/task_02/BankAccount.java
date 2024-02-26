package homeWorks.homeWork_21.task_02;

// Определение класса BankAccount
public class BankAccount {
    // Приватное поле для хранения баланса счета
    private double balance;

    // Конструктор для инициализации баланса счета
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Метод для внесения средств на счет
    public void deposit(double amount) {
        // Увеличение баланса на сумму внесенных средств
        balance += amount;
        System.out.println("Einzahlung von " + amount + " getätigt. Neuer Kontostand beträgt " + balance);
    }

    // Метод для снятия средств со счета
    public void withdraw(double amount) {
        // Проверка наличия достаточного количества средств для снятия
        if (amount <= balance) {
            // Уменьшение баланса на сумму снятия
            balance -= amount;
            System.out.println("Abhebung von " + amount + " bearbeitet. Verbleibender Kontostand beträgt " + balance);
        } else {
            System.out.println("Unzureichende Mittel. Abhebung abgelehnt.");
        }
    }

    // Метод для получения текущего баланса счета
    public double getBalance() {
        return balance;
    }
}


