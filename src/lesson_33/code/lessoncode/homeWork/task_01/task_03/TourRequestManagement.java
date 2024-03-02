package lesson_33.code.lessoncode.homeWork.task_01.task_03;

public class TourRequestManagement {
    public static void main(String[] args) {
        // Пример использования класса TourCollection
        TourCollection tourCollection = new TourCollection(5); // Максимальный размер коллекции - 5

        // Добавляем запросы
        tourCollection.addRequest("Тур в Париж");
        tourCollection.addRequest("Экскурсия по Риму");
        tourCollection.addRequest("Отдых на Бали");
        tourCollection.addRequest("Круиз по Средиземноморью");
        tourCollection.addRequest("Путешествие по Гималаям");
        tourCollection.addRequest("Сафари в Африке"); // Попытка добавить запрос, когда коллекция полна

        // Обрабатываем запросы
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest(); // Попытка обработать запрос, когда список запросов пуст

        // Получаем текущий размер очереди
        System.out.println("Текущий размер очереди: " + tourCollection.getQueueSize());
    }
}
