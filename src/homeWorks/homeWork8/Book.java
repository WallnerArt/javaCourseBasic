package homeWorks.homeWork8;

public class Book {
        private String author;
        private String title;
        private int pageCount;
        private int catalogNumber;
        private String location;

        // Конструкторы
        public Book() {
        }

        public Book(String author, String title) {
            this.author = author;
            this.title = title;
        }

        // Геттеры и сеттеры для всех свойств

        // Метод для печати информации о книге
        public void printDetails() {
            System.out.println("Автор: " + author);
            System.out.println("Название книги: " + title);
            System.out.println("Количество страниц: " + pageCount);
            System.out.println("Номер каталога: " + catalogNumber);
            System.out.println("Местоположение: " + location);
        }

    public void setPageCount(int pageCount) {
    }

    public void setCatalogNumber(int catalogNumber) {
    }

    public void setLocation(String location) {
    }
}









