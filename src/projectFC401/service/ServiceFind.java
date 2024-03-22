package projectFC401.service;

import projectFC401.dto.ClientRequestFind;
import projectFC401.entity.Category;
import projectFC401.entity.Transaction;
import projectFC401.repository.TransactionRepository;

import java.util.List;
import java.util.stream.Collectors;

// Сервис для поиска транзакций
public class ServiceFind extends TransactionRepository {

    private TransactionRepository transactionRepository;

    public ServiceFind(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    public List<Transaction> findTransactions(ClientRequestFind request) {
        List<Transaction> transactions = transactionRepository.findAll();

        if (request.getStartDate() != null && !request.getStartDate().isEmpty()) {
            transactions = transactions.stream()
                    .filter(transaction -> transaction.getDate().compareTo(request.getStartDate()) >= 0)
                    .collect(Collectors.toList());
        }

        if (request.getEndDate() != null && !request.getEndDate().isEmpty()) {
            transactions = transactions.stream()
                    .filter(transaction -> transaction.getDate().compareTo(request.getEndDate()) <= 0)
                    .collect(Collectors.toList());
        }

        if (request.getCategory() != null && !request.getCategory().isEmpty()) {
            Category category = new Category(1, request.getCategory()); // TODO: Изменить на поиск по имени категории
            transactions = transactions.stream()
                    .filter(transaction -> transaction.getCategory().equals(category))
                    .collect(Collectors.toList());
        }

        return transactions;
    }

    public List<Transaction> findAll() {
        return null;
    }
}