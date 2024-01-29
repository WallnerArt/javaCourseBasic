package homeWorks.homeWork7;

public class HomeWork071  {
        public static void main(String[] args) {
            // Шаг 1: Создаем строку через оператор new
            String str = new String("I study Basic Java!");

            // Шаг 2: Вызываем метод, передавая созданную строку в качестве параметра
            manipulateString(str);
        }

        // Метод, который принимает строку в качестве параметра и выполняет с ней операции
        public static void manipulateString(String str) {
            // Шаг 3: Распечатываем последний символ строки
            // Используем метод String.charAt()
            System.out.println("Последний символ строки: " + str.charAt(str.length() - 1));

            // Шаг 4: Проверяем, содержит ли строка подстроку "Java"
            // Используем метод String.contains()
            System.out.println("Содержит ли строка подстроку \"Java\": " + str.contains("Java"));

            // Шаг 5: Заменяем все символы "а" на "о"
            str = str.replace('a', 'o');
            System.out.println("Строка после замены: " + str);

            // Шаг 6: Преобразуем строку к верхнему регистру
            System.out.println("Строка в верхнем регистре: " + str.toUpperCase());

            // Шаг 7: Преобразуем строку к нижнему регистру
            System.out.println("Строка в нижнем регистре: " + str.toLowerCase());

            // Шаг 8: Вырезаем подстроку "Java"
            // Используем метод String.substring()
            if (str.contains("Java")) {
                String substring = str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
                System.out.println("Вырезанная подстрока: " + substring);
            } else {
                System.out.println("Строка не содержит подстроку \"Java\"");
            }
        }
    }













