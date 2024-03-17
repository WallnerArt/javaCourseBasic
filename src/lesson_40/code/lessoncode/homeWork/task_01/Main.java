package lesson_40.code.lessoncode.homeWork.task_01;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иван", 20, 4.7));
        students.add(new Student("Мария", 21, 4.3));
        students.add(new Student("Алексей", 19, 4.9));
        students.add(new Student("Екатерина", 22, 4.2));

        // Фильтрация студентов по возрасту и среднему баллу с использованием потоков
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.age >= 20 && student.avgGrade > 4.5)
                .collect(Collectors.toList());

        // Вывод отфильтрованных студентов
        for (Student student : filteredStudents) {
            System.out.println("Имя: " + student.name + ", Возраст: " + student.age + ", Средний балл: " + student.avgGrade);
        }
    }
}