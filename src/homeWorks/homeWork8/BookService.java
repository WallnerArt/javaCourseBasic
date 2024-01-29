package homeWorks.homeWork8;

public class BookService {

        // Методы для создания книги с различными параметрами
        public static Book createBookWithAuthorAndTitle(String author, String title) {
            return new Book(author, title);
        }

        public static Book createBookWithAllParameters(String author, String title, int pageCount, int catalogNumber, String location) {
            Book book = new Book(author, title);
            book.setPageCount(pageCount);
            book.setCatalogNumber(catalogNumber);
            book.setLocation(location);
            return book;
        }

        // Метод для редактирования книги
        public static void editBook(Book book, int catalogNumber, int pageCount, String location) {
            book.setCatalogNumber(catalogNumber);
            book.setPageCount(pageCount);
            book.setLocation(location);
        }
    }






