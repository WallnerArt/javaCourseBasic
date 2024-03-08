package lesson_37.code.lessoncode.task_01;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Library {
    private Map<String, List<Book>> booksByGenre;

    public Library() {
        this.booksByGenre = new HashMap<>();
    }

    public void addBook(Book book) {
        String genre = book.getGenre();
        if (!booksByGenre.containsKey(genre)) {
            booksByGenre.put(genre, new ArrayList<>());
        }
        booksByGenre.get(genre).add(book);
    }

    public List<Book> getBooksByGenre(String genre) {
        return booksByGenre.getOrDefault(genre, new ArrayList<>());
    }
}