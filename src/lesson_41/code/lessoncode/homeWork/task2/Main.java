package lesson_41.code.lessoncode.homeWork.task2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John", "Sales"),
                new Employee("Alice", "HR"),
                new Employee("Bob", "Sales"),
                new Employee("Eve", "HR"),
                new Employee("Mike", "IT")
        );

        Map<String, Long> departmentCounts = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(departmentCounts);
    }
}