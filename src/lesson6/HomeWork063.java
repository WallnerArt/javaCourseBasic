package lesson6;

import java.util.Scanner;

public class HomeWork063 {

    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Введите диаметр первой пиццы (в см)
        System.out.println("Введите диаметр первой пиццы (в см):");
        double diameter1 = scanner.nextDouble();

        // Введите диаметр второй пиццы (в см)
        System.out.println("Введите диаметр второй пиццы (в см):");
        double diameter2 = scanner.nextDouble();

        // Вычисляем площади пицц
        double area1 = calculatePizzaArea(diameter1);
        double area2 = calculatePizzaArea(diameter2);

        // Вычисляем лишние калории
        double extraCalories = calculateExtraCalories(area1, area2);

        // Выводим результат на консоль
        System.out.println("Лишние калории: " + extraCalories);

        // Закрываем сканер, чтобы избежать утечек ресурсов
        scanner.close();
    }

    // Метод для вычисления площади пиццы
    public static double calculatePizzaArea(double diameter) {
        double radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    // Метод для вычисления лишних калорий
    public static double calculateExtraCalories(double area1, double area2) {
        // Предполагаем, что каждый квадратный сантиметр содержит 40 калорий
        double caloriesPerSquareCentimeter = 40;

        // Вычисляем разницу в площадях и умножаем на калории
        double extraCalories = (area2 - area1) * caloriesPerSquareCentimeter;

        return extraCalories;
    }
}

