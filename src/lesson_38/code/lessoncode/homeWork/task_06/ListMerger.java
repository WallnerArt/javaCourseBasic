package lesson_38.code.lessoncode.homeWork.task_06;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class ListMerger {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        BiFunction<List<Integer>, List<Integer>, List<Integer>> mergeLists = (l1, l2) -> {
            List<Integer> mergedList = new ArrayList<>();
            mergedList.addAll(l1);
            mergedList.addAll(l2);
            return mergedList;
        };

        List<Integer> mergedList = mergeLists.apply(list1, list2);
        System.out.println("Merged list: " + mergedList);
    }
}