package lesson8.code.lessoncode.students;

import lesson6.code.lessoncode.scanner.UserInput;

import java.util.Scanner;

public class StudentManager {


    public Student createStudent() {

        UserInput ui = new UserInput();

        String lastName = ui.inputText("Фамилия: ");
        String firstName = ui.inputText("Имя: ");
        String studentCardNumber = ui.inputText("Номер студенческого: ");
        String group = ui.inputText("Группа: ");

        Student newStudent = new Student(lastName, firstName,studentCardNumber,group);

        return newStudent;
    }
}
