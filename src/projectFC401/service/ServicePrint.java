package projectFC401.service;

import projectFC401.dto.ClientRequestFind;
import projectFC401.entity.Transaction;

import java.util.List;

// Сервис для печати информации
public class ServicePrint {

    private BalanceService balanceService;
    private ServiceFind serviceFind;

    public ServicePrint(BalanceService balanceService, ServiceFind serviceFind) {
        this.balanceService = balanceService;
        this.serviceFind = serviceFind;
    }

    public void printBalance() {
        System.out.println("Текущий баланс: " + balanceService.getCurrentBalance());
    }

    public void printTransactions(ClientRequestFind request) {
        List<Transaction> transactions = serviceFind.findTransactions(request);
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

}