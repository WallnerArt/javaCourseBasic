package lesson_38.code.lessoncode.homeWork.task_01;

import lesson_38.code.lessoncode.homeWork.task_01.StringConverter;

public class Main {

    public static void main(String[] args) {
        StringConverter converter = str -> str.toUpperCase();
        String result = converter.convertToUpperCase("hello");
        System.out.println(result); // Выводит "HELLO"
    }
}