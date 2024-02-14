package lesson_04;

public class HomeWork_044 {
    public static void main(String[] args) {
        // Средняя температура за прошедшую неделю в градусах Цельсия
        double averageTemperature = 1.0;

        // Проверяем, была ли средняя температура положительной
        if (averageTemperature > 0) {
            System.out.println("Средняя температура была положительной за прошедшую неделю.");
        } else if (averageTemperature == 0) {
            System.out.println("Средняя температура была равной нулю за прошедшую неделю.");
        } else {
            System.out.println("Средняя температура была отрицательной за прошедшую неделю.");
        }
    }
}
