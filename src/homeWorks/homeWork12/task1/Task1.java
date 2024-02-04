package homeWorks.homeWork12.task1;

    import java.util.Scanner;
    public class Task1
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрашиваем у пользователя ввод строки
            System.out.print("Введите строку с специальными символами: ");
            String input = scanner.nextLine();

            // Вызываем метод для удаления специальных символов
            String result = removeSpecialCharacters(input);

            // Выводим результат
            System.out.println("Строка без специальных символов: " + result);
        }

        // Метод для удаления специальных символов из строки
        public static String removeSpecialCharacters(String input) {
            StringBuilder result = new StringBuilder();

            // Перебираем каждый символ входной строки
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                // Проверяем, является ли символ специальным
                if (c != '(' && c != ')' && c != '@') {
                    // Если не специальный, добавляем его к результату
                    result.append(c);
                }
            }

            return result.toString();
        }
    }


