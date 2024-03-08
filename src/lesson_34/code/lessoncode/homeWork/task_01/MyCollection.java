package lesson_34.code.lessoncode.homeWork.task_01;
public class MyCollection<E> {
    private Object[] elements;
    private int size;

    public MyCollection() {
        this.elements = new Object[10];
        this.size = 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        elements[size] = element;
        size++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (size == elements.length) {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public int size() {
        return size;
    }

    // Добавляем метод get(int), чтобы получать элемент по индексу
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return (E) elements[index];
    }
}
