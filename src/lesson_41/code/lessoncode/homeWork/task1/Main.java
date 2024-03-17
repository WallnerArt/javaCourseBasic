package lesson_41.code.lessoncode.homeWork.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "banana", "Avocado", "orange");

        List<String> filteredAndSorted = strings.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredAndSorted);
    }
}