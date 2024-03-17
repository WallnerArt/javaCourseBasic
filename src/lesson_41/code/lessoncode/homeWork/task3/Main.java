package lesson_41.code.lessoncode.homeWork.task3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список заказов
        List<Order> orders = new ArrayList<>();

        // Создаем несколько покупок для первого заказа
        List<Purchase> purchases1 = new ArrayList<>();
        purchases1.add(new Purchase("Телефон", 1000));
        purchases1.add(new Purchase("Наушники", 200));
        Order order1 = new Order(purchases1, LocalDate.of(2022, Month.JANUARY, 15));
        orders.add(order1);

        // Создаем несколько покупок для второго заказа
        List<Purchase> purchases2 = new ArrayList<>();
        purchases2.add(new Purchase("Книга", 50));
        purchases2.add(new Purchase("Ручка", 5));
        Order order2 = new Order(purchases2, LocalDate.of(2022, Month.FEBRUARY, 5));
        orders.add(order2);

        // Вычисляем общую стоимость покупок в текущем месяце
        double totalCost = calculateTotalCostInCurrentMonth(orders);
        System.out.println("Общая стоимость покупок в текущем месяце: " + totalCost);
    }

    public static double calculateTotalCostInCurrentMonth(List<Order> orders) {
        double totalCost = 0;

        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();

        // Проходим по каждому заказу
        for (Order order : orders) {
            // Проверяем, является ли дата заказа текущей датой месяца
            if (order.getOrderDate().getMonth() == currentDate.getMonth()) {
                // Проходим по каждой покупке в заказе и добавляем ее стоимость к общей сумме
                for (Purchase purchase : order.getPurchases()) {
                    totalCost += purchase.getCost();
                }
            }
        }

        return totalCost;
    }
}