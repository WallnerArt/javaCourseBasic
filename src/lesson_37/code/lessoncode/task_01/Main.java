package lesson_37.code.lessoncode.task_01;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        // Создаем несколько книг разных жанров
        Book book1 = new Book("Властелин Колец", "Фэнтези");
        Book book2 = new Book("Убийство в восточном экспрессе", "Детектив");
        Book book3 = new Book("Марсианские хроники", "Научная фантастика");
        Book book4 = new Book("Гарри Поттер", "Фэнтези");

        // Добавляем книги в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Получаем список книг по заданному жанру
        List<Book> fantasyBooks = library.getBooksByGenre("Фэнтези");

        // Выводим названия книг на экран
        for (Book book : fantasyBooks) {
            System.out.println("Название: " + book.getTitle() + ", Жанр: " + book.getGenre());
        }
    }
}