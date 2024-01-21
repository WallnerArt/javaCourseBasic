package lesson4;

public class HomeWork_043 {
    public static void main(String[] args ) {
        // Задаем цены товаров
int priceA = 1000;
int priceB = 500;

// Задаем скидку на всю покупку
        int discount = 100;

        // Вычисляем стоимость суммы A + B со скидкой
        int totalCost = priceA + priceB - discount;

        // Выводим на экран стоимость суммы A + B со скидкой
        System.out.println("Стоимость суммы A + B со скидкой: " + totalCost + " руб");

        // Выводим на экран сумму скидки
        System.out.println("Скидка на покупку: " + discount + " руб");
    }
}
