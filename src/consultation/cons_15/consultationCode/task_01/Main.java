package consultation.cons_15.consultationCode.task_01;

public class Main {

    public static void main(String[] args) {
        String message = "Текст запроса";
        int value = 150;

        processRequest(message, value);
    }

    public static void processRequest(String message, int value) {
        // Проверяем корректность данных
        if (message.length() < 10) {
            // Используем значение из запроса для определения сообщения
            if (value >= 100 && value <= 200) {
                System.out.println("Запрос получен");
            } else if (value > 200 && value <= 300) {
                System.out.println("Ок");
            } else if (value > 300 && value <= 400) {
                System.out.println("Сервисный запрос");
            } else if (value > 400 && value <= 500) {
                System.out.println("Ошибка пользователя");
            } else if (value > 500 && value <= 550) {
                System.out.println("Ошибка сервера");
            } else {
                System.out.println("Некорректное значение запроса");
            }
        } else {
            System.out.println("Некорректная длина сообщения");
        }
    }
}