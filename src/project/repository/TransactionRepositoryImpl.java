package project.repository;


import project.entity.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepositoryImpl {
    private List<Transaction> transactions;

    public TransactionRepositoryImpl() {
        transactions = new ArrayList<>();
    }
}