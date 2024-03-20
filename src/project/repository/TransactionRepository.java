package project.repository;


import project.entity.Transaction;

import java.util.List;

public interface TransactionRepository {
    void addTransaction(Transaction transaction);
    void removeTransaction(Transaction transaction);
    List<Transaction> getAllTransactions();
}