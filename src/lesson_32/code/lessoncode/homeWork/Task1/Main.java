package lesson_32.code.lessoncode.homeWork.Task1;

import java.util.Stack;

public class Main {
    // Функция для сортировки стека
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        // Пока исходный стек не пуст
        while (!stack.isEmpty()) {
            // Извлекаем элемент из исходного стека
            int temp = stack.pop();

            // Переносим элементы из временного стека обратно в исходный стек,
            // которые больше, чем текущий элемент, чтобы поддерживать порядок
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            // Помещаем текущий элемент в правильное место во временном стеке
            tempStack.push(temp);
        }

        // Переносим элементы обратно из временного стека в исходный стек
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(4);

        // Сортируем стек
        sortStack(stack);

        // Выводим элементы отсортированного стека
        System.out.println("Отсортированный стек:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}


