package homeWorks.homeWork8;

import java.util.Scanner;

public class BookAllParameters {
        public static void main(String[] args) {
            // Вводим данные с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите автора книги:");
            String author = scanner.nextLine();
            System.out.println("Введите название книги:");
            String title = scanner.nextLine();
            System.out.println("Введите количество страниц:");
            int pageCount = scanner.nextInt();
            System.out.println("Введите номер каталога:");
            int catalogNumber = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после nextInt
            System.out.println("Введите местоположение книги:");
            String location = scanner.nextLine();
            scanner.close();

            // Создаем книгу с полными параметрами
            Book book = BookService.createBookWithAllParameters(author, title, pageCount, catalogNumber, location);

            // Выводим информацию о книге
            book.printDetails();
        }
    }


