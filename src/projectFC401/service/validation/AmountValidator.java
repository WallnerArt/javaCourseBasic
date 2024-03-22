package projectFC401.service.validation;
// Валидатор суммы
public class AmountValidator implements Validator {
    @Override
    public boolean validate(Request request) {
        if (!request.getField().equals("amount")) {
            return true;
        }

        try {
            Double.parseDouble(request.getValue());
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}