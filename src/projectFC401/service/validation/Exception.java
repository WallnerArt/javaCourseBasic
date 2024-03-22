package projectFC401.service.validation;

// Исключение для валидации
public class Exception extends RuntimeException {

    private Exception(String message) {
        super(message);
    }

    public static Exception createException(String message) {
        return new Exception(message);
    }
}
