package homeWorks.homeWork8;

import java.util.Scanner;

public class BookFirstParameters {

        public static void main(String[] args) {
            // Вводим данные с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите автора книги:");
            String author = scanner.nextLine();
            System.out.println("Введите название книги:");
            String title = scanner.nextLine();
            scanner.close();

            // Создаем книгу с известными только автором и названием
            Book book = BookService.createBookWithAuthorAndTitle(author, title);

            // Выводим информацию о книге
            book.printDetails();
        }
    }


