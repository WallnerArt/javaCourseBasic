package lesson4;

public class HomeWork_042 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 2, num4 = 3, num5 = 4, num6 = 5, num7 = 6, num8 = 7, num9 = 8, num10 =9;

        //Вычисление суммы и среднего арифметического
        int sum = num1 + num2 +num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        int average = sum / 10;

        //Вывод среднего арифметического на экран
        System.out.println("Среднее арифметическое: " + average);

        //Вычисление остатка от деления суммы на 10
        int remainder = sum % 10;

        //Вывод остатка на экран
        System.out.println("Программа отбросила в дробной части: " + remainder);
    }
}
