package lesson_34.code.lessoncode.homeWork.task_04;
public class MyCollection<E> {
    private Object[] elements;
    private int size;

    public MyCollection() {
        elements = new Object[10]; // Начальный размер массива
        size = 0; // Начальный размер коллекции
    }

    public void add(E element) {
        ensureCapacity(size + 1); // Убедимся, что есть достаточно места для нового элемента
        elements[size++] = element; // Добавляем элемент в конец коллекции
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Недопустимый индекс");
        }

        ensureCapacity(size + 1); // Убедимся, что есть достаточно места для нового элемента

        // Сдвигаем элементы вправо, начиная с конца
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = element; // Вставляем элемент по указанному индексу
        size++; // Увеличиваем размер коллекции
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Недопустимый индекс");
        }

        // Сдвигаем элементы влево, начиная с указанного индекса
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null; // Освобождаем последний элемент
        size--; // Уменьшаем размер коллекции
    }

    public int size() {
        return size; // Возвращаем текущий размер коллекции
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2; // Увеличиваем размер массива в два раза
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size); // Копируем элементы в новый массив
            elements = newElements; // Заменяем старый массив новым
        }
    }

    // Дополнительные методы и тестирование можно добавить здесь
}