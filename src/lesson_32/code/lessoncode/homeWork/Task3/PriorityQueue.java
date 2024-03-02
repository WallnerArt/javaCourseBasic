package lesson_32.code.lessoncode.homeWork.Task3;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue<T> {
    private Queue<Element<T>> queue;

    public PriorityQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element, int priority) {
        queue.offer(new Element<>(element, priority));
    }

    public T dequeue() {
        Element<T> highestPriorityElement = null;
        int highestPriority = Integer.MIN_VALUE;

        // Находим элемент с наивысшим приоритетом
        for (Element<T> element : queue) {
            if (element.priority > highestPriority) {
                highestPriorityElement = element;
                highestPriority = element.priority;
            }
        }

        // Удаляем элемент из очереди и возвращаем его значение
        if (highestPriorityElement != null) {
            queue.remove(highestPriorityElement);
            return highestPriorityElement.value;
        }

        return null; // Очередь пуста
    }

    private static class Element<T> {
        private T value;
        private int priority;

        public Element(T value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Добавляем элементы с разными приоритетами
        priorityQueue.enqueue("A", 2);
        priorityQueue.enqueue("B", 1);
        priorityQueue.enqueue("C", 3);

        // Извлекаем элементы с наивысшим приоритетом
        System.out.println(priorityQueue.dequeue()); // C
        System.out.println(priorityQueue.dequeue()); // A
        System.out.println(priorityQueue.dequeue()); // B
        System.out.println(priorityQueue.dequeue()); // null (очередь пуста)
    }
}

