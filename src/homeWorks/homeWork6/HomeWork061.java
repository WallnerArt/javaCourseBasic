package homeWorks.homeWork6;
public class HomeWork061 {
        public static void main(String[] args) {
            // 1. Создаем строку через new - I study Basic Java!
            String myString = new String("I study Basic Java!");

            // 2. Пишем метод, который принимает в качестве параметра строку,
            // передайте в этот метод строку, которую создали в п.1
            printStringInfo(myString);

            // 8. Вырезаем строку Java с помощью метода String.substring().
            String substr = myString.substring(myString.indexOf("Java"), myString.indexOf("Java") + "Java".length());
            System.out.println("Substring 'Java': " + substr);
        }
        // Метод для распечатки информации о строке
         public static void printStringInfo(String inputString) {
            // 3. Распечатываем последний символ строки. Используем метод String.charAt().
            char lastChar = inputString.charAt(inputString.length() - 1);
            System.out.println("Last character: " + lastChar);

            // 4. Проверяем, содержит ли ваша строка подстроку “Java”.
            // Используем метод String.contains().
            boolean containsJava = inputString.contains("Java");
            System.out.println("Contains 'Java': " + containsJava);

            // 5. Заменяем все символы “а” на “о”.
            String replacedString = inputString.replace('a', 'o');
            System.out.println("String after replacement: " + replacedString);

            // 6. Преобразуем строку к верхнему регистру.
            String upperCaseString = inputString.toUpperCase();
            System.out.println("Uppercase: " + upperCaseString);

            // 7. Преобразуем строку к нижнему регистру.
            String lowerCaseString = inputString.toLowerCase();
            System.out.println("Lowercase: " + lowerCaseString);
        }
    }


