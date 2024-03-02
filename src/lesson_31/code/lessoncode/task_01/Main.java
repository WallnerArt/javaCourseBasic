package lesson_31.code.lessoncode.task_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int x = 15; // Заданное значение X

        removeNumbersGreaterThanX(numbers, x);

        System.out.println("Измененный список после удаления чисел, больших " + x + ":");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void removeNumbersGreaterThanX(List<Integer> numbers, int x) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > x) {
                iterator.remove(); // Удаляем число, большее X
            }
        }
    }
}


