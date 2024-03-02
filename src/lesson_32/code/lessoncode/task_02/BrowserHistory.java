package lesson_32.code.lessoncode.task_02;

import java.util.LinkedList;
import java.util.Queue;

public class BrowserHistory {
    private Queue<String> history;

    public BrowserHistory() {
        this.history = new LinkedList<>();
    }

    // Метод для добавления просмотренной страницы в историю
    public void addPage(String page) {
        history.offer(page); // Добавляем страницу в конец очереди
    }

    // Метод для вывода всей истории построчно
    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("История браузера пуста.");
        } else {
            System.out.println("История браузера:");
            for (String page : history) {
                System.out.println(page);
            }
        }
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        // Добавляем просмотренные страницы
        browser.addPage("https://www.example.com/page1");
        browser.addPage("https://www.example.com/page2");
        browser.addPage("https://www.example.com/page3");

        // Выводим всю историю
        browser.printHistory();
    }
}


