package lesson_32.code.lessoncode.task_01;


import java.util.Stack;

public class Task1 {

    public static void main(String[] args) {
        String[] stringsForTest = {
                "()",
                "[]({})",
                "([()[](){()}])",
                ")[]()",
                "({([])})"
        };

        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + " is correct : " + isCorrectBracket(arrayElement));
        }
    }

    public static boolean isCorrectBracket(String stringLine) {
        Stack<Character> stack = new Stack<>();
        for (char ch : stringLine.toCharArray()) {
            // Помещаем в стек "ожидаемые" закрывающиеся скобки
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                // Если стек пуст при встрече закрывающей скобки, последовательность неверна
                if (stack.isEmpty()) {
                    return false;
                }
                // Проверяем, соответствует ли верхний элемент стека текущей закрывающей скобке
                char expectedClosingBracket = stack.pop(); // Получаем и удаляем "ожидаемую" закрывающую скобку

                if (ch != expectedClosingBracket) {
                    return false; // Если не соответствует, последовательность неверна
                }
            }
        }
        // Если стек пуст после обработки всех символов, последовательность верна
        return stack.empty();
    }
}


