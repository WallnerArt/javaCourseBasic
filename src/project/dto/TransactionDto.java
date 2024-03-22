package project.dto;

public class TransactionDto {
    private double amount;
    private String category;
    private String date;

    public TransactionDto(double amount, String category, String date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Object getField() {

        return null;
    }

    public Object getValue() {
        return null;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}