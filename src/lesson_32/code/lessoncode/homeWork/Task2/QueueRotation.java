package lesson_32.code.lessoncode.homeWork.Task2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRotation {
    public static void rotateQueue(Queue<Integer> queue, int k) {
        // Проверяем, что k не превышает размер очереди
        k = k % queue.size();

        // Выполняем k ротаций
        for (int i = 0; i < k; i++) {
            // Удаляем последний элемент из очереди
            int lastElement = queue.poll();

            // Добавляем удаленный элемент в начало очереди
            queue.offer(lastElement);
        }
    }

    public static void main(String[] args) {
        // Создаем очередь и добавляем элементы
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        // Выполняем 3 ротации
        rotateQueue(queue, 3);

        // Выводим содержимое очереди после ротации
        System.out.println(queue); // [3, 4, 5, 1, 2]
    }
}


