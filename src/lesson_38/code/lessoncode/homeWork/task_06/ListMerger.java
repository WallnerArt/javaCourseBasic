package lesson_38.code.lessoncode.homeWork.task_06;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class ListMerger {

    public static void main(String[] args) {
        // Создание и инициализация списка list1
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Создание и инициализация списка list2
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Определение BiFunction для объединения двух списков
        BiFunction<List<Integer>, List<Integer>, List<Integer>> mergeLists = (l1, l2) -> {
            // Создание нового списка для объединения
            List<Integer> mergedList = new ArrayList<>();
            // Добавление всех элементов из первого списка
            mergedList.addAll(l1);
            // Добавление всех элементов из второго списка
            mergedList.addAll(l2);
            // Возвращение объединенного списка
            return mergedList;
        };
        // Применение BiFunction к list1 и list2 для объединения
        List<Integer> mergedList = mergeLists.apply(list1, list2);
        // Вывод объединенного списка на экран
        System.out.println("Merged list: " + mergedList);
    }
}