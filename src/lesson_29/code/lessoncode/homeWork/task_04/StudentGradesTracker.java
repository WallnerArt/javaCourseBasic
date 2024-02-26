package lesson_29.code.lessoncode.homeWork.task_04;

import java.util.HashMap;

public class StudentGradesTracker {
    public static void main(String[] args) {
        // Создание HashMap для отслеживания оценок студентов
        HashMap<String, Double> studentGrades = new HashMap<>();

        // Добавление данных пяти студентов
        studentGrades.put("Иванов", 4.5);
        studentGrades.put("Петров", 3.8);
        studentGrades.put("Сидоров", 4.2);
        studentGrades.put("Смирнов", 4.0);
        studentGrades.put("Козлов", 4.6);

        // Поиск и вывод имени студента с наивысшим средним баллом
        String studentWithHighestGrade = "";
        double highestGrade = Double.MIN_VALUE;
        for (String student : studentGrades.keySet()) {
            double averageGrade = studentGrades.get(student);
            if (averageGrade > highestGrade) {
                highestGrade = averageGrade;
                studentWithHighestGrade = student;
            }
        }
        System.out.println("Студент с наивысшим баллом: " + studentWithHighestGrade);

        // Изменение среднего балла одного из студентов и вывод обновленных данных
        String modifiedStudent = "Сидоров";
        double newGrade = 4.4;
        studentGrades.put(modifiedStudent, newGrade);
        System.out.println("Обновленные данные:");
        for (String student : studentGrades.keySet()) {
            double averageGrade = studentGrades.get(student);
            System.out.println(student + " : " + averageGrade);
        }
    }
}

