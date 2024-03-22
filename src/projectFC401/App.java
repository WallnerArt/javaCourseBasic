package projectFC401;

import lesson_42.code.lessoncode.code.exception.userException.ValidationService;
import project.dto.TransactionDto;
import projectFC401.entity.Transaction;
import projectFC401.repository.TransactionRepository;
import projectFC401.service.ServiceAddOrUpdate;
import projectFC401.service.ServiceFind;

import java.util.List;

public class App {
    public static void main(String[] args) {
        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setDate("2023-12-01");
        transactionDto.setType("income");
        transactionDto.setCategory("salary");
        transactionDto.setAmount(100000.0);

        ValidationService validationService = new ValidationService();
        validationService.validate(transactionDto);

        ServiceAddOrUpdate serviceAddOrUpdate = new ServiceAddOrUpdate(TransactionRepository.createTransactionRepository(), new UserRepository());
        serviceAddOrUpdate.add(transactionDto);

        List<Transaction> transactions = new ServiceFind(TransactionRepository.createTransactionRepository()).findAll();
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}