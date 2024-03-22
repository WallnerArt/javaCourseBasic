package projectFC401.service;

import lesson_37.code.lessoncode.practice.UserRepository;
import project.dto.TransactionDto;
import projectFC401.dto.ClientRequest;
import projectFC401.repository.TransactionRepository;
import projectFC401.service.validation.ValidationService;

// Сервис для добавления и обновления транзакций
public class ServiceAddOrUpdate {

    private TransactionRepository transactionRepository;
    private ValidationService validationService;

    public ServiceAddOrUpdate(TransactionRepository transactionRepository, UserRepository validationService) {
        this.transactionRepository = transactionRepository;
        this.validationService = validationService;
    }

    public void addTransaction(ClientRequest request) throws Exception {
        validationService.validate(request);

        Category category = new Category(1, request.getCategory()); // TODO: Изменить на поиск по имени категории
        Transaction transaction = new Transaction(0, request.getType(), category, request.getDate(), request.getAmount());
        transactionRepository.save(transaction);

        BalanceService balanceService = new BalanceService(new BalanceRepository()); // TODO: Внедрить через DI
        balanceService.updateBalance(request.getAmount());
    }

    public void add(TransactionDto transactionDto) {
    }
}