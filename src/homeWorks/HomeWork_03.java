package homeWorks;
public class HomeWork_03 {

    public static void main(String[] args) {
        // Произвольное трехзначное число (пример: 345)
        int number = 345;

        // Извлекаем цифры числа
        int digit3 = number % 10;          // третья цифра числа
        int digit2 = (number / 10) % 10;   // вторая цифра числа
        int digit1 = number / 100;         // первая цифра числа

        // Выводим значения переменных в консоль
        System.out.println("Число " + number + " -> " + digit1 + ", " + digit2 + ", " + digit3);
    }
}


