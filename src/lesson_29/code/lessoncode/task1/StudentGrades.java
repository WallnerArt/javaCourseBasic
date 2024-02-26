package lesson_29.code.lessoncode.task1;

import java.util.*;

public class StudentGrades {

    public static void main(String[] args) {
        // Создаем Map для хранения оценок студентов
        Map<String, Map<String, Integer>> studentGrades = new HashMap<>();

        // Добавляем данные об оценках
        addStudentGrade(studentGrades, "Alice", "Math", 90);
        addStudentGrade(studentGrades, "Alice", "Physics", 85);
        addStudentGrade(studentGrades, "Bob", "Math", 75);
        addStudentGrade(studentGrades, "Bob", "Physics", 80);

        // Получаем оценки конкретного студента
        String studentName = "Alice";
        Map<String, Integer> aliceGrades = getStudentGrades(studentGrades, studentName);
        if (aliceGrades != null) {
            System.out.println(studentName + "'s grades: " + aliceGrades);
        } else {
            System.out.println("No grades found for student: " + studentName);
        }
    }

    // Добавление оценки студенту
    public static void addStudentGrade(Map<String, Map<String, Integer>> studentGrades, String studentName, String subject, int grade) {
        // Если студент уже существует в Map, получаем его коллекцию оценок, иначе создаем новую коллекцию
        Map<String, Integer> grades = studentGrades.computeIfAbsent(studentName, k -> new HashMap<>());
        // Добавляем оценку по предмету
        grades.put(subject, grade);
    }

    // Получение оценок конкретного студента
    public static Map<String, Integer> getStudentGrades(Map<String, Map<String, Integer>> studentGrades, String studentName) {
        return studentGrades.get(studentName);
    }
}


