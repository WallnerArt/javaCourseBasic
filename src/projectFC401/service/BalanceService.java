package projectFC401.service;

import projectFC401.entity.Balance;

// Сервис для работы с балансом
public class BalanceService {

    private final BalanceRepository balanceRepository;

    public BalanceService(BalanceRepository balanceRepository) {
        this.balanceRepository = balanceRepository;
    }

    public double getCurrentBalance() {
        Balance balance = balanceRepository.findById(1); // TODO: Изменить на поиск по ID пользователя
        return balance.getAmount();
    }

    public void updateBalance(double amount) {
        Balance balance = balanceRepository.findById(1); // TODO: Изменить на поиск по ID пользователя
        balance.setAmount(balance.getAmount() + amount);
        balanceRepository.save(balance);
    }

}