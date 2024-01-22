package homeWorks;

public class HomeWork_046 {
    public static void main(String[] args) {
        // Проверка остатка от деления на 2
        System.out.println("Остатки от деления на 2:");
        for (int i = 0; i <= 10; i++) {
            int remainder = i % 2;
            System.out.println(i + " % 2 = " + remainder);
        }

        // Перевод строки для разделения вывода
        System.out.println();

        // Проверка остатка от деления на 3
        System.out.println("Остатки от деления на 3:");
        for (int i = 0; i <= 10; i++) {
            int remainder = i % 3;
            System.out.println(i + " % 3 = " + remainder);
        }
    }
}



