package homeWorks.homeWork8;

public class BookDemo {
        public static void main(String[] args) {
            // Демонстрация работы с книгами
            // Создаем книгу с известными только автором и названием
            Book book1 = BookService.createBookWithAuthorAndTitle("Пушкин", "Руслан и Людмила");
            // Выводим информацию о книге
            book1.printDetails();

            // Создаем книгу с полными параметрами
            Book book2 = BookService.createBookWithAllParameters("Есенин", "Стихи", 222, 2, "Хранилище");
            // Выводим информацию о книге
            book2.printDetails();

            // Редактируем книгу
            BookService.editBook(book1, 1, 333, "На руках");
            // Выводим обновленную информацию о книге
            book1.printDetails();
        }
    }



