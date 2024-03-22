package projectFC401.service.validation;
// Класс для хранения запроса на валидацию
public class Request {
    private String field;
    private String value;


    private String type;
    private String category;
    private String date;
    private double amount;


    public Request(String field, String value) {
        this.field = field;
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public String getValue() {
        return value;
    }
}

