package lesson_33.code.lessoncode.homeWork.task_01.task_03;

import java.util.LinkedList;
import java.util.Queue;

class TourCollection {
    private Queue<String> requests; // Используем очередь для хранения туристических запросов
    private int maxSize; // Максимально допустимый размер коллекции

    // Конструктор для инициализации коллекции и максимального размера
    public TourCollection(int maxSize) {
        this.maxSize = maxSize;
        requests = new LinkedList<>();
    }

    // Метод для добавления запроса в коллекцию
    public void addRequest(String request) {
        if (requests.size() < maxSize) {
            requests.add(request);
            System.out.println("Запрос добавлен: " + request);
        } else {
            System.out.println("Коллекция запросов полна. Невозможно добавить новый запрос.");
        }
    }

    // Метод для обработки первого запроса в коллекции
    public void processRequest() {
        if (!requests.isEmpty()) {
            String processedRequest = requests.poll(); // Удаляем и возвращаем первый элемент из очереди
            System.out.println("Обработан запрос: " + processedRequest);
        } else {
            System.out.println("Список запросов пуст. Нет запросов для обработки.");
        }
    }

    // Метод для получения текущего размера очереди
    public int getQueueSize() {
        return requests.size();
    }

    // Геттеры для доступа к коллекции и maxSize
    public Queue<String> getRequests() {
        return requests;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
