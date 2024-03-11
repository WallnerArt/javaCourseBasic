package lesson_39.code.lessoncode.task_03;
import java.util.ArrayList;
import java.util.List;

public class LambdaStudentExample {

    public static void main(String[] args) {
        // Создание списка студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Emily", 22));
        students.add(new Student("Michael", 19));
        students.add(new Student("Sarah", 21));

        // Фильтрация студентов с помощью лямбда-выражения
        List<Student> filteredStudents = filterStudents(students, student -> student.getAge() >= 20);

        // Вывод отфильтрованного списка студентов
        for (Student student : filteredStudents) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }

    public static List<Student> filterStudents(List<Student> students, StudentPredicate predicate) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (predicate.test(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

interface StudentPredicate {
    boolean test(Student student);
}