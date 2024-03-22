package projectFC401.service;

import lesson_44.code.lessoncode.appVariant.dto.ClientRequestFind;
import projectFC401.entity.Transaction;
import projectFC401.repository.TransactionRepository;

import java.util.List;

// Сервис для расчета баланса за период
public class ServiceCalculatorBalance {

    ServiceFind serviceFind;
    ServiceCalculatorBalance serviceCalculatorBalance = new ServiceCalculatorBalance(serviceFind);
    public void setServiceFind(ServiceFind serviceFind) {
        this.serviceFind = serviceFind;
    }

    ServiceFind serviceFind = new ServiceFind(TransactionRepository.createTransactionRepository());
    ServiceCalculatorBalance serviceCalculatorBalance;


    public ServiceCalculatorBalance(TransactionRepository serviceFind) {
        this.serviceFind = new ServiceFind(TransactionRepository.createTransactionRepository());
        this.serviceFind = serviceFind;
    }

    public double calculateBalance(ClientRequestFind request) {
        List<Transaction> transactions = serviceFind.findTransactions(request);
        double income = transactions.stream()
                .filter(transaction -> transaction.getType().equals("income"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        double expense = transactions.stream()
                .filter(transaction -> transaction.getType().equals("expense"))
                .mapToDouble(Transaction::) ;
    }

    public Double calculateBalance(long l, String startDate, String endDate) {
        return null;
    }
}

