package lesson_32.code.lessoncode.task_01;

import java.util.Stack;

public class StackBracketsDemo {
    public static void main(String[] args) {
        String[] stringsForTest = {
                "()",
                "()(())",
                "((()()()(())))",
                ")()()",
                "((())",
                "{}",
                "{[]}",
                "{[()]}",
                "{[()]}",
                "([](())[}[[[))"
        };

        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + " is correct : " + isCorrectBracket(arrayElement));
        }
    }

    public static boolean isCorrectBracket(String stringLine){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringLine.length(); i++) {
            char ch = stringLine.charAt(i);

            // если элемент - открывающаяся скобка
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // если наш стек - пуст, то значит что нет первоначальной открывающейся скобки
                if (stack.empty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}


