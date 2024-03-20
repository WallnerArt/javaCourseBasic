package project.service;


import project.dto.TransactionDto;
import project.entity.Transaction;
import project.repository.TransactionRepository;

import java.util.List;

public class TransactionService {
    private TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void addTransaction(TransactionDto transactionDto) {
        // Преобразование TransactionDto в Transaction
        Transaction transaction = new Transaction(
                transactionDto.getAmount(),
                transactionDto.getCategory(),
                transactionDto.getDate()
        );

        // Добавление транзакции в репозиторий
        transactionRepository.addTransaction(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.getAllTransactions();
    }

    // Другие методы, связанные с бизнес-логикой
}