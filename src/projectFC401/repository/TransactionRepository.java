package projectFC401.repository;

import projectFC401.entity.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Репозиторий для транзакций
public abstract class TransactionRepository implements InterfaceRepository<Transaction> {

    private final List<Transaction> transactions = new ArrayList<>(); // Список транзакций

    private TransactionRepository() {
    }

    public static TransactionRepository createTransactionRepository() {
        return new TransactionRepository();
    }


    @Override
    public void save(Locale.Category category) {

    }

    @Override
    public Transaction findById(int id) {
        for (Transaction transaction : transactions) {
            if (transaction.getId() == id) {
                return transaction;
            }
        }
        return null;
    }

    @Override
    public List<Transaction> findAll() {
        return transactions;
    }
}