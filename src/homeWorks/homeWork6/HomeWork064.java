package homeWorks.homeWork6;

import java.util.Scanner;

public class HomeWork064 {

    public static void main(String[] args) {

        // Тема: создание переменной типа String
        // Создаем переменную типа String и присваиваем ей в качестве начального значения ваше имя
        String myName = "Ваше Имя";

        // Выводим на консоль значение переменной
        System.out.println("Значение переменной myName: " + myName);

        // Тема: Конкатенация строк
        // Создаем переменную типа String и присваиваем ей в качестве начального значения ваше имя
        String yourName = "Ваше Имя";

        // Конкатенируем строки и выводим приветствие на консоль
        System.out.println("Hi " + yourName);

        // Тема: Считывание строк с консоли
        // Создаем объект Scanner для ввода данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Спрашиваем как зовут пользователя и считываем его имя с консоли
        System.out.println("Как вас зовут?");
        String userName = scanner.nextLine();

        // Выводим приветствие на консоль
        System.out.println("Hello " + userName + "!");

        // Закрываем сканер, чтобы избежать утечек ресурсов
        scanner.close();
    }
}


