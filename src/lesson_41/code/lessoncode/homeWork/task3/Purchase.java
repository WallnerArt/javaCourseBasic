package lesson_41.code.lessoncode.homeWork.task3;
public class Purchase {
    private String productName;
    private double cost;

    public Purchase(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public double getCost() {
        return cost;
    }
}