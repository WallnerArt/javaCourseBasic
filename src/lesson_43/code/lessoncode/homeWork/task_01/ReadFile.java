package lesson_43.code.lessoncode.homeWork.task_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "C\\Users\\walln\\IdeaProjects\\javaCourseBasic\\src\\lesson_42\\code\\lessoncode\\resource\\fileWriterDemo.txt";

            // Указываем путь к нашему текстовому файлу
        try {
            FileReader fileReader = new FileReader(fileName);
            //мы используем классы FileReader и BufferedReader для чтения данных из текстового файла.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Мы открываем файл с помощью FileReader, а затем оборачиваем его в BufferedReader для повышения производительности чтения.
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            //  В цикле while мы читаем построчно из файла с помощью метода readLine()
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}