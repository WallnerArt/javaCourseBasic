package lesson_40.code.lessoncode.task1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilterAndSort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "banana", "Ant", "cat", "apricot");

        List<String> filteredAndSortedStrings = strings.stream()
                .filter(str -> str.toLowerCase().startsWith("a"))
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

        System.out.println("Отфильтрованные и отсортированные строки: " + filteredAndSortedStrings);
    }
}