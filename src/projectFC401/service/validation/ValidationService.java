package projectFC401.service.validation;

import java.util.ArrayList;
import java.util.List;
// Сервис для валидации запроса
public class ValidationService {

    private List<Validator> validators = new ArrayList<>();

    public ValidationService() {
        validators.add(new AmountValidator());
        validators.add(new DateValidator()); // TODO: Добавить другие валидаторы
    }

    public void validate(Request request) throws Exception {
        for (Validator validator : validators) {
            validator.validate(request);
        }
    }

}