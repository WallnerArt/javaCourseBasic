package homeWorks.homeWork8;

import java.util.Scanner;

public class BookAddParameters {
        public static void main(String[] args) {
            // Создаем книгу с известными только автором и названием
            Book book = BookService.createBookWithAuthorAndTitle("Пушкин", "Руслан и Людмила");

            // Вводим дополнительные параметры с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер каталога:");
            int catalogNumber = scanner.nextInt();
            System.out.println("Введите количество страниц:");
            int pageCount = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после nextInt
            System.out.println("Введите местоположение книги:");
            String location = scanner.nextLine();
            scanner.close();

            // Редактируем книгу, добавляя дополнительные параметры
            BookService.editBook(book, catalogNumber, pageCount, location);

            // Выводим информацию о книге
            book.printDetails();
        }
    }


