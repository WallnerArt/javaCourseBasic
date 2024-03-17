package lesson_43.code.lessoncode.homeWork.task_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "C\\Users\\walln\\IdeaProjects\\javaCourseBasic\\src\\lesson_42.code.lessoncode\\resource\\fileWriterDemo.txt";

        // Укажите путь к вашему текстовому файлу
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}