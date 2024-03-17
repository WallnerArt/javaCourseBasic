package lesson_41.code.lessoncode.homeWork.task3;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private List<Purchase> purchases;
    private LocalDate orderDate;

    public Order(List<Purchase> purchases, LocalDate orderDate) {
        this.purchases = purchases;
        this.orderDate = orderDate;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}