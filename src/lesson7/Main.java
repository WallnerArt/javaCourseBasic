package lesson7;

    /*

    Введите 2 слова, используйте сканер.
Получить слово, состоящее из первой половины первого слова и второй половины второго слова.

для этого: взять первое слово, найти его длину, вычислить индекс его середины и получить подстроку которая начинается с 0 индекса и до середины
затем, взять второе слово, найти его длину, вычислить индекс его середины и получить подстроку которая начинается с середины и до конца


Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.

если букв 4 то 2 + 2 ( от 0 индекса до 2) 4 / 2 = 2
если букв 5 то 2 + 1 + 2 (от 0 индекса до 2) 5 / 2 = 2.5

в формуле вычисления середины - округлить вниз для первого слова или округлить вверх для второго слова



Распечатать на консоль.
1 Еще раз запросите у пользователя строку
2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
3 Распечатать последний символ строки. Используем метод String.charAt().
4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
5 Заменить все символы “а” на “о”.
6 Преобразуйте строку к верхнему регистру.
7 Преобразуйте строку к нижнему регистру.
8 Вырезать строку Java c помощью метода String.substring().

     */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Еще раз запросите у пользователя строку
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        // 2. Напишите метод, который принимает в качестве параметра строку
        printLastCharacter(inputString);

        // 3. Распечатать последний символ строки
        System.out.println("Последний символ строки: " + inputString.charAt(inputString.length() - 1));

        // 4. Проверить, содержит ли ваша строка подстроку “Java”
        System.out.println("Содержит ли строка подстроку \"Java\": " + inputString.contains("Java"));

        // 5. Заменить все символы “а” на “о”
        String replacedString = inputString.replace('а', 'о');
        System.out.println("Строка после замены: " + replacedString);

        // 6. Преобразуйте строку к верхнему регистру
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 7. Преобразуйте строку к нижнему регистру
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 8. Вырезать строку Java с помощью метода String.substring()
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите строку: ");
                String inputString = scanner.nextLine();

                String substringRemoved = inputString.replaceAll("Java", "");
                System.out.println("Строка после вырезания подстроки \"Java\": " + substringRemoved);
            }
        }


        // Метод для печати последнего символа строки
    public static void printLastCharacter(String str) {
        System.out.println("Последний символ строки: " + str.charAt(str.length() - 1));
    }
}

