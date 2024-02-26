package lesson_29.code.lessoncode.task1;

import java.util.*;

public class WebsiteVisits {

    public static void main(String[] args) {
        // Создаем множество для хранения уникальных идентификаторов пользователей
        Set<String> uniqueUsers = new HashSet<>();

        // Посещение сайта пользователем
        String userId1 = "user123";
        logVisit(uniqueUsers, userId1);
        String userId2 = "user456";
        logVisit(uniqueUsers, userId2);
        String userId3 = "user123"; // повторный визит пользователя
        logVisit(uniqueUsers, userId3);

        // Выводим количество уникальных посетителей
        System.out.println("Number of unique visitors: " + uniqueUsers.size());
    }

    // Логирование посещения пользователем сайта
    public static void logVisit(Set<String> uniqueUsers, String userId) {
        // Добавляем идентификатор пользователя в множество уникальных пользователей
        uniqueUsers.add(userId);
    }
}


